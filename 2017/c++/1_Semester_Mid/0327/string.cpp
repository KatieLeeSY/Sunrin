#include<iostream>
#include<string>
using namespace std;

int main(){
	string s1 = "This is a test."; //string 객체를 생성하고 초기화한다.
	string s2;
	
	cout << s1 << endl;
	cout << "문자열을 입력하시오: " << endl;
	cin >> s2;
	cout << s2 << endl;
	cout << s1.size() << endl;

	return 0;
}