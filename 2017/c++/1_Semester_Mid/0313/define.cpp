#include<iostream>
#define LEN 5
using namespace std;
int main(void)
{
	const double PI = 3.141592;

	cout << "반지름이" << LEN << "인 원의 둘레: " << LEN * 2 * PI << endl;
	cout << "반지름이" << LEN << "인 원의 둘레: " << LEN * LEN * PI << endl;
	return 0;
}