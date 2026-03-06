import sys

num = sys.stdin.readline().strip()
for i in sorted(list(num) , reverse=True):
    print(i , end='')
