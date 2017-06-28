#include<iostream>
using namespace std;
int main()
{
	char str1[20];
	char str2[20];

	cout << "str1 문자열을 입력하세요: ";
	cin >> str1;
	cout << "str2 문자열을 입력하세요: ";
	cin >> str2;

	strcat(str1, str2);

	cout << "str1: " << str1 << endl;
	return 0;
}

/*
문자열 s2를 s1의 끝에 붙여넣는다.
s2의 시작 문자가 s1의 마지막에 있는 Null문자를 덮어쓰며 두 개의 문자열을 연결
복사전 메모리 공간을 확인하지 않아 오버플로우 발생가능
*/