fhead = open('romeo.txt')

words = []
for aline in fhead:
    tmp = aline.split()
    for i in tmp:
        if not words.count(i)>0:
            words.append(i)
words.sort()
print(words)
