words = ["cat", "mouse", "tiger", "lion"]
shortest = word[0]
for i in range(1, len(words)):
    if len(words[i])<len(shortest):
        shortest = words[i]
print("가장 짧은 단어는 ", shortest)
