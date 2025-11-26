size = int(input())

arr = [list(map(int, input().split())) for i in range(size)]

for i in sorted(arr, key=lambda x: (x[1], x[0])):
    print(i[0], i[1])
