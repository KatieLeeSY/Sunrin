#include <iostream>
#include <string>
using namespace std;

class Employee{
	string name;
	int salary;
	int age;
	//������ ������ ��ȯ
	int getSalary(){
		return salary;
	}
public:
	//������ ���̸� ��ȯ
	int getAge(){
		return age;
	}
	//������ �̸��� ��ȯ
	string getName(){
		return name;
	}
};
int main(){
	Employee e;
	e.salary = 300;		//����!private ����
	e.age = 26;			//����!private ����
	int sa = e.getSalary();	//����!private ����
	string s = e.getName();	//OK!
	int a = e.getAge();		//OK!

	return 0;
}