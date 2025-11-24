size = input()

arr = []

before = 0
sum = 0

for i in range(1, int(size) + 1):
    a = int(input())
    if a == 0:
        arr.pop()
    else:
        arr.append(a)



for  i in arr:
    sum +=i

print(sum)