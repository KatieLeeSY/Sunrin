#include<iostream>
using namespace std;
int main()
{
	char str1[20];
	char str2[20];
	char str3[20];

	cout << "str1 ���ڿ��� �Է��ϼ���: ";
	cin >> str1;

	strcpy(str2, str1);
	strcpy(str3, "�����Ұž�");

	cout << "str2: " << str2 << endl;
	cout << "str3: " << str3 << endl;
	return 0;
}

/*���ڿ� s2�� s1�� �����Ѵ�.
������ �޸� ������ Ȯ������ �ʾ� �����÷ο� �߻�����

�ǽ�: ���ڿ��� �Է¹޾� str1�� �����ϰ�,
str2�� str1�� �����Ѵ�.
str3�� ���ڿ� "�����Ұž�"�� �����Ѵ�.
*/