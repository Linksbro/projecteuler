count = 0
for a in range(1, 300):
    for b in range(1, 300):
        c = a ** b
        if len(str(c)) == b:
            print(str(c)+"="+str(a)+"^"+str(b))
            count+=1
print(count)