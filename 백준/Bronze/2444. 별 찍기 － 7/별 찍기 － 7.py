size = input()

for i in range(1, int(size) + 1):
    print(" " * (int(size) - i), end="")
    print("*" * (i * 2 - 1))

for i in range(1, int(size) ):
    print(" " * i  , end="")
    print("*" * ((int(size) - i) * 2 - 1))
