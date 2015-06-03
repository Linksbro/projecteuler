squares = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
fcache = {}
def f(n):
    sum = 0
    ints = tuple([int(i) for i in str(n)])
    if ints in fcache:
        return fcache[ints]
    else:
        for i in ints:
            sum += squares[i]
        fcache[ints] = sum
    return sum

goodEnd = set([89])
badEnd = set([1])
for x in range(10000000, 1, -1):
    if x % 1000 is 0:
        print(x)
    chain = [x]
    z = x
    while True:
        z = f(z)
        chain.append(z)
        if z in goodEnd or z is 89:
            goodEnd |= set(chain)
            break;
        elif z in badEnd or z is 1:
            badEnd |= set(chain)
            break;
print(len(goodEnd))
