#fhand = open('mbox.txt')
#print(fhand)
#fhand.close()
fhand = open('mbox-short.txt')
cnt=0
find=0
for line in fhand:
    print(line, end="")
    cnt+=1
    if(line=='berkeley.edu'):find+=1
fhand.close()
print("line= ",cnt)
print("find= ",find)
