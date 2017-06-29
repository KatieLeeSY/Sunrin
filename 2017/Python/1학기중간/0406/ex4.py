pay = eval(input("투입한돈: "))
value = eval(input("물건값: "))
change = pay - value
if(change<0): print("돈이 부족합니다")
else :
    print("500원 동전의 개수: ",change//500)
    print("100원 동전의 개수: ",(change%500)//100)
