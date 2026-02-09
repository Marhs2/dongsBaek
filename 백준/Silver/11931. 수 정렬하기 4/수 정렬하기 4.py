import sys


a = int(sys.stdin.readline())

b = [int(sys.stdin.readline()) for _ in range(a)]

for i in sorted(b, reverse=True): print(i)
