#include<iostream>
using namespace std;
int main()
{
	char str1[20];
	char str2[20];

	cout << "str1 ���ڿ��� �Է��ϼ���: ";
	cin >> str1;
	cout << "str2 ���ڿ��� �Է��ϼ���: ";
	cin >> str2;

	strcat(str1, str2);

	cout << "str1: " << str1 << endl;
	return 0;
}

/*
���ڿ� s2�� s1�� ���� �ٿ��ִ´�.
s2�� ���� ���ڰ� s1�� �������� �ִ� Null���ڸ� ����� �� ���� ���ڿ��� ����
������ �޸� ������ Ȯ������ �ʾ� �����÷ο� �߻�����
*/