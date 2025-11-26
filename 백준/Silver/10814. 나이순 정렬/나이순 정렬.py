size = int(input())

arr = []

for i in range(size):
    text = input().split()
    arr.append((text[0], text[1], i))

for i in sorted(arr, key=lambda x: (int(x[0]), int(x[2]))):
    print(i[0], i[1])
