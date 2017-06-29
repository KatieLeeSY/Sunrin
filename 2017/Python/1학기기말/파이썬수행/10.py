#파일을오픈한다.
f = open("E:\\students.txt","r")

#파일의각줄에대하여반복한다.
for line in f.readlines():

    #공백문자를제거한다.
    line = line.strip()

    #줄을출력한다.
    print(line)

    #줄을단어로분리한다.
    words = line.split(", ")

    #줄의단어를출력한다.
    for word in words:
        print(" ",word)
