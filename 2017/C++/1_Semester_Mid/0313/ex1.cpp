#include<iostream>
using namespace std;

int main(void)
{
	char str[10];
	int cnt = 0;
	cin.getline(str, 100);
	for (int i = 0; str[i] != '\0'; i++)
	{
		if (str[i] == 's') cnt++;
	}
	cout << "sÀÇ °³¼ö: " << cnt << endl;
	return 0;
}