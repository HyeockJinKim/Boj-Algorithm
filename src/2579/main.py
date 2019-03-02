
def stair(n, score):
    result = []

    result.append(score[0])
    result.append(result[0]+score[1])
    if score[0] > score[1]:
        result.append(score[0]+score[2])
    else:
        result.append(score[1]+score[2])
    i = 3
    while i>=3 and i < n :
        if result[i-3]+score[i-1] > result[i-2]:
            result.append(result[i-3]+score[i-1] + score[i])
        else:
            result.append(result[i-2] + score[i])
        i=i+1
    print result[n-1]


i=0
n = input()
sc = []
while i < n:
    temp = input()
    sc.append(temp)
    i = i +1
stair(n,sc)