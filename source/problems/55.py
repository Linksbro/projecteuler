def isPalendromic(n):
    return str(n) == str(n)[::-1]
def isLychrel(n):
    for i in range(50):
        if isPalendromic(n + int(str(n)[::-1])):
            return 1
        n = n + int( str(n)[::-1] )
    return 0

count = 0
for r in range(1, 10001):
    if not isLychrel(r):
        count += 1
print(count)