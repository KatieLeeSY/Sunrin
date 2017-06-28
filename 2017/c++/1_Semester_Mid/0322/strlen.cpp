#include<iostream>
using namespace std;
int main()
{
	char str1[20];

	cout << "str1 문자열을 입력하세요: ";
	cin >> str1;

	cout << "str1의 길이: " << strlen(str1) << endl;
	return 0;
}