import math

def next(n):
    res = 0
    digits = [int(x) for x in str(n)]
    for d in digits:
        res += math.factorial(d)
    return res

def chain(n):
    count = 1
    nextNum = n
    chain = []
    while count <= 60 and nextNum not in chain:
        chain.append(nextNum)
        nextNum = next(nextNum)
        count += 1
    return chain

def optiChain(n):
    count = 1
    nextNum = n
    chain = []
    while count <= 60 and nextNum not in chain:
        strNextNum = str(nextNum)
        if strNextNum in CHAINS and not chainClash(chain, CHAINS[strNextNum]):
            chain = chain + CHAINS[strNextNum]
            count += len(CHAINS[strNextNum])
            nextNum = next(chain[-1])
        else:
            chain.append(nextNum)
            nextNum = next(nextNum)
            count += 1
    return chain


def chainClash(c, c2):
    for element in c:
        if element in c2:
            return True
    return False

CHAINS = {}
CHAINCOUNT = 0
for n in range(1000000):
    chain = optiChain(n)
    CHAINS[str(n)] = chain
    if len(chain) is 60:
        print(n)
        CHAINCOUNT += 1
print(CHAINCOUNT)

