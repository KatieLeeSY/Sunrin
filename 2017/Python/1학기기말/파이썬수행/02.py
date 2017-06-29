dogNames = []
while True:
    name = input('이름 입력')
    if name == '':
        break
    dogNames.append(name)

print('참석자들의 이름:')
for name in dogNames:
    print(name, end=", ")
