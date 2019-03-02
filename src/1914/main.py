
def hanoicon(x, y, z, n):
    if n == 1:
        print str(x) + " " + str(y)
    else:
        hanoicon(x, z, y, n-1)
        print str(x) + " " + str(y)
        hanoicon(z, y, x, n-1)

def hanoi(n):
    return pow(2, n)-1

a = input()
print hanoi(a)
if a <= 20:
    hanoicon(1, 3, 2, a)