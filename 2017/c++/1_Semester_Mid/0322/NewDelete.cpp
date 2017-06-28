#include<iostream>
#include<cstring>
//#include<string.h>
//#include<stdlib.h>
using namespace std;
char* MakeStrAdr(int len)
{
	//char* str=(char*)malloc(sizeof(char)*len);
	char* str = new char[len];
	return str;
}
int main()
{
	char* str = MakeStrAdr(20);
	strcpy(str, "I am so happy!!");
	cout << str << endl;
	//free(str);
	delete[]str;

	return 0;
}

/*
동적 메모리 할당의 과정
*/