#include<iostream>
using namespace std;
int get_average(const int score[], int n);
void increment(int score[], int n);
int main()
{
	const int STUDENTS = 5;
	int grade[STUDENTS] = { 1, 2, 3, 4, 5 };
	int avg;

	increment(grade, STUDENTS);
	avg = get_average(grade, STUDENTS);
	cout << "����� " << avg << "�Դϴ�." << endl;

	return 0;
}

void increment(int score[], int n)
{
	int i;
	for (i = 0; i < n; i++)
	{
		++score[i];
	}
}

int get_average(const int score[], int n)
{
	int i;
	int sum = 0;

	for (i = 0; i < n; i++)
	{
		sum += score[i];
	}
	return sum / n;
}

/*
�迭�� �Լ�
�迭�� �Լ��� �μ��� �����ϴ� ��쿡�� �迭 �̸��� �������̹Ƿ� �����Ͱ� ���޵ȴ�.
*/