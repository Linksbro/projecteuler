from fractions import Fraction, gcd
import math
d = 100000000000000000
sets = {Fraction(a, b) 
    for b in range(d-5, d+1) 
        for a in range 
            (math.floor((3/7)*b)-5, math.floor((3/7)*b)+5) 
                if gcd(a,b) is 1 and a/b < 3/7
        }
sets.add(Fraction(3, 7))
sets = sorted(list(sets))
print(sets[sets.index(Fraction(3,7))-1])
print(len(sets))