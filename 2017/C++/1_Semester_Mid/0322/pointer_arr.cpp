#include<iostream>
using namespace std;
int main()
{
	const int STUDENTS = 5;
	int grade[STUDENTS] = { 10, 20, 30, 40, 50 };

	/*for (int i = 0; i < STUDENTS; i++)
		cout << grade[i] << " ";
	*/

	for (int *p = grade, *pend = grade + STUDENTS; p != pend; p++)
		cout << *p << " ";
}

/*
포인터와 배열
배열 이름은 첫 번째 배열 원소의 주소
포인터를 사용해서 배열 원소를 처리 가능
*/