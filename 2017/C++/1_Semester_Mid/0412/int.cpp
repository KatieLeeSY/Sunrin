#include<iostream>
using namespace std;
int main(){
	int *ptr;
	int i;

	ptr = new int(3);	//동적 생성과 동시에 초기화 가능
	cout << *ptr << endl;
	delete ptr;

	ptr = new int[5]{1,2,3,4,5};
	for (i = 0; i < 5; i++){
		printf("%-3d", ptr[i]);
	}
}