import math

def calCircle(r):
    # 반지름이 r인 원의 넓이와 둘레를 동시에 반환하는 함수(area, circum)
    area = math.pi * r * r
    circum = 2 * math.pi * r
    return (area, circum)

radius = float(input("원의반지름을입력하시오:"))
(a, c) = calCircle(radius)
print("원의 넓이는 " + str(a) + "이고 원의 둘레는 " + str(c) + "이다.")
