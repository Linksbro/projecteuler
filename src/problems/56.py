max = 0
for a in range(1, 101):
    for b in range(1, 101):
        num = a ** b
        digitsum = sum(map(int,str(num)))
        if digitsum > max:
            max = digitsum
print(max)