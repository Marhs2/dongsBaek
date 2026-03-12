arr = []
for i in range(28):
    arr.append(int(input()))

for i in range(30):
    if i + 1 not in arr:
        print(i + 1)
