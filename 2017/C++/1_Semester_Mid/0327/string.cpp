#include<iostream>
#include<string>
using namespace std;

int main(){
	string s1 = "This is a test."; //string ��ü�� �����ϰ� �ʱ�ȭ�Ѵ�.
	string s2;
	
	cout << s1 << endl;
	cout << "���ڿ��� �Է��Ͻÿ�: " << endl;
	cin >> s2;
	cout << s2 << endl;
	cout << s1.size() << endl;

	return 0;
}