def solution(s):
    arr = s.lower().split(" ")
    for idx, word in enumerate(arr):
        if word:
            arr[idx] = word.replace(word[0], word[0].upper(), 1)
    print(word)
    return " ".join(arr)
