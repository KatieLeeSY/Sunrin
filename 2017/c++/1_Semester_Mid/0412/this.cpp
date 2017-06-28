#include<iostream>
using namespace std;
class Car{
private:
	int speed;
public:
	Car(int sp) :speed(sp){}
	void print(){
		int speed = 10;
		printf("%d\n", this->speed);
	}
};
int main(){
	Car c1(1);
	c1.print();
	return 0;
}