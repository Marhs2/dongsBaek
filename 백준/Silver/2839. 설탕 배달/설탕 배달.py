import math

size = int(input())

total = 0

while size >= 0:
    if size % 5 == 0:
        total += size // 5
        print(total)
        break

    size -= 3
    total += 1

else:
    print(-1)
