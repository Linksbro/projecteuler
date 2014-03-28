import math
import re
def romanToDec(r):
    values = {'I': 1,
              'V': 5,
              'X': 10,
              'L': 50,
              'C': 100,
              'D': 500,
              'M': 1000}
    value = 0
    for c in r:
        if c is not '\n':
            value += values[c]
    return value;

def decToRoman(d):
    roman = {'1':['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX'],
            '2':['X', 'XX', 'XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC'],
            '3':['C', 'CC', 'CCC', 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM'],
            '4':['M', 'MM', 'MMM', 'MMMM', 'MMMMM', 'MMMMMM', 'MMMMMMM',
                'MMMMMMMM', 'MMMMMMMMM']
           }
    numeral = ''
    while d:
        digit = math.floor(d / (10 ** (len(str(d))-1)))
        numeral += roman[str(len(str(d)))][digit-1]
        d = d % 10 ** (len(str(d))-1)
    return numeral

max = 0
dif = 0
with open('roman.txt') as f:
    for line in f:
        if romanToDec(line) > max:
            max = romanToDec(line)
        num = romanToDec(line)
        optimized = decToRoman(num)
        print (repr(line) + " " + str(num) + " " + str(optimized))
        dif += (len(line)-1 - len(str(optimized)))
print(dif)

dif = 0
pattern = r"DCCCC|LXXXX|VIIII|CCCC|XXXX|IIII";
replace = r"kk"
with open('roman.txt') as f:
    for line in f:
        new = re.sub(pattern, replace, line)
        print(line + new)


