#include<iostream>
#include<string>
using namespace std;
class Car{
public:
	int speed;
	int gear;
	string color;
public:
	//������
	int getSpeed(){
		return speed;
	}
	//������
	void setSpeed(int s){
		speed = s;
	}
	int getGear(){
		return gear;
	}
	void setGear(int g){
		gear = g;
	}
	string getColor(){
		return color;
	}
	void setColor(string c){
		color = c;
	}
};
int main(){
	Car myCar;
	myCar.setSpeed(20);
	cout << myCar.getSpeed() << endl;
	return 0;
}