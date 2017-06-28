#include<iostream>
using namespace std;
int main()
{
	char str1[20];
	char str2[20];
	char str3[20];

	cout << "str1 문자열을 입력하세요: ";
	cin >> str1;

	strcpy(str2, str1);
	strcpy(str3, "복사할거얌");

	cout << "str2: " << str2 << endl;
	cout << "str3: " << str3 << endl;
	return 0;
}

/*문자열 s2를 s1에 복사한다.
복사전 메모리 공간을 확인하지 않아 오버플로우 발생가능

실습: 문자열을 입력받아 str1에 저장하고,
str2에 str1을 복사한다.
str3에 문자열 "복사할거얍"을 복사한다.
*/