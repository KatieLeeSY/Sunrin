#include<iostream>
using namespace std;

//int main(void)
//{
//	char a[10];
//	cin.getline(a, 10);
//	cout << a << endl;
//	return 0;
//}

int main(void)
{
	char a[10];
	cin.getline(a, 10, 'c');
	cout << a << endl;
	return 0;
}