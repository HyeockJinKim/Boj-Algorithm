def star(n):
    m = n
    while(n>0):
        temp = ""
        for i in range(0,n-1):
            temp = temp + " "
        a = 2 * (m-n+1) - 1
        for j in range(0,a):
            temp = temp + "*"
        n = n-1
        print temp

a = input()

star(a)