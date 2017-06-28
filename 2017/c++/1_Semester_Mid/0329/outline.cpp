#include <iostream>
#include <string>
using namespace std;
class Car{
public:
	int getSpeed();
	void setSpeed(int s);
	void honk();
private:
	int speed;
};
// 외부에서 정의->일반적인 함수와 동일하게 호출
int Car::getSpeed(){
	return speed;
}
void Car::setSpeed(int s){
	speed = s;
}
void Car::honk(){
	cout << "빵빵!" << endl;
}
int main(){
	Car myCar;
	myCar.setSpeed(80);
	myCar.honk();
	cout << "현재 속도는 " << myCar.getSpeed() << endl;
	return 0;
}
