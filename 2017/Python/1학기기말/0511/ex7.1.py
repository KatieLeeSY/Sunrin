fhand = open('mbox.txt')
for line in fhand:
    if(line>=97 and line<=122):
        line-=32
        print(line)
