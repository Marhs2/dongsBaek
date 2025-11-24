size = input()

arr = []

for i in range(1, int(size) + 1):
    x, y = map(int, input().split())
    arr.append((x, y))

arr.sort()


for i in arr:
    print(i[0], i[1])
