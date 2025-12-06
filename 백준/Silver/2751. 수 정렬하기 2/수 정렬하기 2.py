import sys

input_data = sys.stdin.read().split()

if input_data:
    arr = sorted(map(int, input_data[1:]))

    sys.stdout.write('\n'.join(map(str, arr)) + '\n')
