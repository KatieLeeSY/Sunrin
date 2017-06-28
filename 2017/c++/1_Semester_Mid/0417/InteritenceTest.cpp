#include<iostream>
using namespace std;
class Car{ //슈퍼클래스
	int speed;
};
class SportsCar :public Car{ //서브클래스(수퍼클래스를 포함한다)
	bool turbo;
};
/*
Animal(슈퍼클래스) : Lion,Dog,Cat(서브클래스)
슈퍼클래스==부모클래스(parent class)==베이스클래스(base class)
서브클래스 == 자식클래스(child class) == 파생된 클래스(derived class)
*/