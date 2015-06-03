from fractions import Fraction
import sys
sys.setrecursionlimit(1500)
def rootTwo(i):
    if i is 0:
        return Fraction(1,2)
    else:
        return Fraction(1, 2+rootTwo(i-1))
count = 0
for times in range(1, 1001):
    fract = Fraction(1 + rootTwo(times))
    if len(str(fract.numerator)) > len(str(fract.denominator)):
        count += 1
print(count)
