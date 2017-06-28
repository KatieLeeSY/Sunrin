#include<iostream>
using namespace std;
int main()
{
	int a = 100;
	int *p = &a;

	cout << p << endl;
	cout << ++p << endl;
	cout << ++p << endl;
	cout << ++p << endl;
	return 0;
}

/*
증가 연산 예제
*/