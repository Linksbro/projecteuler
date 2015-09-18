#prime check http://stackoverflow.com/a/15285588
def is_prime(n):
    if n == 2 or n == 3:
        return True
    if n < 2 or n % 2 == 0:
        return False
    if n < 9:
        return True
    if n % 3 == 0:
        return False
    r = int(n**0.5)
    f = 5
    while f <= r:
        if n % f == 0:
            return False
        if n % (f + 2) == 0:
            return False
        f += 6
    return True

def main():
    diagonals = [3, 5, 7, 9] #seed diagonals
    diagonal_step = 4        #next diagonal is 9+4=13
    primes_on_diagonals = [3, 5, 7]
    length_size = 3
    while True:
        next_diagonals = [diagonals[-1] + diagonal_step, diagonals[-1] + diagonal_step*2, diagonals[-1] + diagonal_step*3, diagonals[-1] + diagonal_step*4]
        diagonals.extend(next_diagonals)
        diagonal_step += 2
        length_size += 2
        for diag in next_diagonals:
            if is_prime(diag):
                primes_on_diagonals.append(diag)
        if float(len(primes_on_diagonals)) / len(diagonals) < 0.1:
            print(length_size)
            return

main()
