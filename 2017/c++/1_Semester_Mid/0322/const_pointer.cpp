#include<iostream>
using namespace std;
void display(const int *xpos, const int *ypos);
void move(int *xpos, int *ypos);
int main()
{
	int x = 10;
	int y = 20;

	display(&x, &y);
	move(&x, &y);
	display(&x, &y);

	return 0;
}

void display(const int *xpos, const int *ypos)
{
	cout << "현재의 위치 " << *xpos << "," << *ypos << endl;
}

void move(int *xpos, int *ypos)
{
	*xpos = *xpos + 1;
	*ypos = *ypos + 1;
}

/*
Const와 포인터
1) 포인터 변수가 가리키는 변수가 const인 경우
int i1=10;
int i2=20;
const int* p=&i1;
p=&i2; //OK
*p=30; //FAIL
2) 포인터 변수 자신이 const인 경우
3) 두 변수 모두 const인 경우
*/