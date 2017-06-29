fhand = open('test3_copy.txt','w')
fhand.write()
fhand1 = open('mbox.txt')
cnt=0
for line in fhand1:
    if(line.find('Find:')==-1):continue
    print(line.find('Find:'))
    cnt+=1
print("cnt: ",cnt)
fhand.close()
fhand1.close()
