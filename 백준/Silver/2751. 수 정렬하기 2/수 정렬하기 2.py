import sys

input = sys.stdin.readline

size = int(input().strip())

arr = [int(input().strip()) for i in range(size)]

arr.sort()

for i in arr:
    sys.stdout.write(str(i) + '\n')
