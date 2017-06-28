#include<iostream>
using namespace std;
int main()
{
	int year;
	cout << "연도 입력: ";
	cin >> year;

	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
	{
		cout << "윤년" << endl;
	}
	else
	{
		cout << "평년" << endl;
	}
	return 0;
}