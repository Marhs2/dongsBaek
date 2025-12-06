import sys

input = sys.stdin.readline

size = int(input().strip())

arr = list(int(input().strip()) for i in range(size))

arr.sort()

for i in arr:
    print(i)
