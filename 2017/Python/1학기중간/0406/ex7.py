originId = "sunrin"
originPw = "123456"

myId = input("아이디를 입력하시오: ")
myPw = input("패스워드를 입력하시오: ")

if(originId!=myId): print("아이디가 올바르지 않습니다.")
else if(originPw!=myPw): print("비밀번호가 올바르지 않습니다.")
else: print("환영합니다!")
