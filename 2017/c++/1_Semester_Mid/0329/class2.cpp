#include <iostream>
#include <string>
using namespace std;

class Car{
public:
	//멤버변수선언
	int speed;
	int gear;
	string color;

	//멤버함수선언
	void speedUp(){ //속도증가멤버함수
		speed += 10;
	}
	void speedDown(){ //속도감소멤버함수
		speed -= 10;
	}
	void show(){ //상태출력멤버함수
		cout << "=============" << endl;
		cout << "속도: " << speed << endl;
		cout << "기어: " << gear << endl;
		cout << "색상: " << color << endl;
		cout << "=============" << endl;
	}
};
int main(){
	Car myCar;
	myCar.speed = 100;
	myCar.gear = 3;
	myCar.color = "red";

	Car *yourCar = new Car;
	yourCar->speed = 10;
	yourCar->gear = 1;
	yourCar->color = "blue";

	myCar.speedUp();
	yourCar->speedUp();

	myCar.show();
	yourCar->show();
	return 0;
}