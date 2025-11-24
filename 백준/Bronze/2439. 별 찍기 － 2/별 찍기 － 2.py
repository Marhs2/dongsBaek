size = input()

for i in range(1, int(size) + 1):
    print(" " * (int(size) - i) , end="")
    print("*" * i )
