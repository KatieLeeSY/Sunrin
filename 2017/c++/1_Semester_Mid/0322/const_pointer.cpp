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
	cout << "������ ��ġ " << *xpos << "," << *ypos << endl;
}

void move(int *xpos, int *ypos)
{
	*xpos = *xpos + 1;
	*ypos = *ypos + 1;
}

/*
Const�� ������
1) ������ ������ ����Ű�� ������ const�� ���
int i1=10;
int i2=20;
const int* p=&i1;
p=&i2; //OK
*p=30; //FAIL
2) ������ ���� �ڽ��� const�� ���
3) �� ���� ��� const�� ���
*/