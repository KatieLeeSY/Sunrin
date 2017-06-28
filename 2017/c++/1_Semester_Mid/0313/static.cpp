#include <iostream>
using namespace std;
void sub(void)
{
	int i = 0; //지역변수
	static int s = 0; //정적변수

	i++;
	s++;
	cout << "i: " << i << "	" << "s: " << s << endl;
}
int main()
{
	sub();
	sub();
	sub();
	return 0;
}