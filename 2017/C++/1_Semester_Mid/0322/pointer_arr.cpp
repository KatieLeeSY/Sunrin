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
�����Ϳ� �迭
�迭 �̸��� ù ��° �迭 ������ �ּ�
�����͸� ����ؼ� �迭 ���Ҹ� ó�� ����
*/