print("▶Exercise 3.1\n")
hour = eval(input('Enter Hours: '))
rate = eval(input('Enter Rate: '))
pay=hour*rate
if(hour>=40): pay=(40*rate) + (hour-40)*rate*1.5
print('Pay: ',pay,"\n")

print("▶Exercise 3.2\n")
def num():
    try:
        hour = eval(input('Enter Hours: '))
        rate = eval(input('Enter Rate: '))
        if type(hour)==type(0) and type(rate)==type(0):
            pay=hour*rate
            if(hour>=40): pay=(40*rate) + (hour-40)*rate*1.5
            print('Pay: ',pay,"\n")
            pass
    except:
        print('Error, Please enter numeric input')
        num()
num()

print("▶Exercise 3.3\n")
print('Score  Grade')
print('>=0.9  A')
print('>=0.8  B')
print('>=0.7  C')
print('>=0.6  D')
print('<  F')
def test():
    try:
        score = eval(input('Enter score: '))
        #if type(hour)==type(0) and type(score)==type(0.1) and score>=0.0 and score<=1.0:
        if(score>=0.9 and score<=1.0): grade = 'A'
        if(score>=0.8 and score<0.9): grade = 'B'
        if(score>=0.7 and score<0.8): grade = 'C'
        if(score>=0.6 and score<0.7): grade = 'D'
        if(score<0.6 and score>=0.0): grade = 'F'
        print(grade)
    except:
        print('Bad score')
        test()
test()
        
