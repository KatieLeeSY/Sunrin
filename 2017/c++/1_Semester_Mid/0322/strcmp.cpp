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

	int result = strcmp(str1, str2);

	if (result == 0)
		cout << "같은 문자열" << endl;
	else if (result<0)
		cout << "str1이 str2보다 사전적으로 앞에 있음" << endl;
	else
		cout << "str1이 str2보다 사전적으로 뒤에 있음" << endl;
	return 0;
}

/*
음수(<0): 문자열 string1이 string2보다 사전적으로 앞에 있습니다.
0: 문자열 string1과 string2는 일치합니다.
양수(>0): 문자열 string1이 string2보다 사전적으로 뒤에 있습니다.
*/