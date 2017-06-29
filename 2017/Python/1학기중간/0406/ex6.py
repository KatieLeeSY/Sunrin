x1 = eval(input("x1: "))
y1 = eval(input("y1: "))
x2 = eval(input("x2: "))
y2 = eval(input("y2: "))
x = x1-x2
y = y1-y2
if(x<0): x*=-1
if(y<0): y*=-1
dis = (x**2 + y**2)**0.5
print(dis)
