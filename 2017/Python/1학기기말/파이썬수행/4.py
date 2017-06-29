word=["cat","mouse","tiger","lion"]
shortest = word[0]
for i in range(1,len(word)):
    if len(word[i])<len(shortest):
        shortest = word[i]
print("가장 짧은 단어는", shortest)
