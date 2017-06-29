# 파일을 오픈한다.
f = open("E:\\students.txt","r")

# 파일의 각 줄에 대하여 반복한다.
for line in f.readlines():

    # 공백 문자를 제거한다.
    line = line.strip()

    # 줄을 출력한다.
    print(line)

    # 줄을 단어로 분리한다.
    words = line.split(", ")

    # 줄의 단어를 출력한다.
    for word in words:
        print(" ", word)
