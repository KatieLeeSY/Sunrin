#include<iostream>
using namespace std;
class Car{ //����Ŭ����
	int speed;
};
class SportsCar :public Car{ //����Ŭ����(����Ŭ������ �����Ѵ�)
	bool turbo;
};
/*
Animal(����Ŭ����) : Lion,Dog,Cat(����Ŭ����)
����Ŭ����==�θ�Ŭ����(parent class)==���̽�Ŭ����(base class)
����Ŭ���� == �ڽ�Ŭ����(child class) == �Ļ��� Ŭ����(derived class)
*/