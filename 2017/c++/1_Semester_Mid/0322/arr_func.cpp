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
	cout << "평균은 " << avg << "입니다." << endl;

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
배열과 함수
배열을 함수의 인수로 전달하는 경우에는 배열 이름이 포인터이므로 포인터가 전달된다.
*/