def originInTriangle(p0x, p0y, p1x, p1y, p2x, p2y):
    a = 1/2 * (-p1y * p2x + p0y * (-p1x + p2x) + p0x * (p1y - p2y) + p1x * p2y)
    sign = -1
    if (a > 0):
        sign = 1
    s = (p0y * p2x - p0x * p2y) * sign
    t = (p0x * p1y - p0y * p1x) * sign
    return s > 0 and t > 0 and (s + t) < 2 * a * sign
COUNT = 0
with open("triangles") as f:
    for line in f:
        params = line.rstrip().split(",")
        params = [int(p) for p in params]
        if originInTriangle(params[0], params[1], params[2], params[3], params[4], params[5]):
            COUNT += 1
print(COUNT)