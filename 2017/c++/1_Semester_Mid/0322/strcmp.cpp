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

	int result = strcmp(str1, str2);

	if (result == 0)
		cout << "���� ���ڿ�" << endl;
	else if (result<0)
		cout << "str1�� str2���� ���������� �տ� ����" << endl;
	else
		cout << "str1�� str2���� ���������� �ڿ� ����" << endl;
	return 0;
}

/*
����(<0): ���ڿ� string1�� string2���� ���������� �տ� �ֽ��ϴ�.
0: ���ڿ� string1�� string2�� ��ġ�մϴ�.
���(>0): ���ڿ� string1�� string2���� ���������� �ڿ� �ֽ��ϴ�.
*/