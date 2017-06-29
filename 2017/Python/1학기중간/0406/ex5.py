plus = 0
num = eval(input())
if (type(num)!=int):
   print("정수를 입력하세요")
else:
    while 1:
        if(num%10==0):break
        num=int(num)
        plus+=num%10
        num/=10
print(plus)
