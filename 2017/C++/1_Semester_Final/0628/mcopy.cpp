#include<iostream>
using namespace std;
template <class T1, class T2>
void mcopy(T1 src[], T2 dest[], int n){
	for (int i = 0; i < n; i++){
		dest[i] = (T2)src[i];
	}
}
int main(){
	int x[] = { 1, 2, 3, 4, 5 }, y[5];
	char c[5] = { 'H', 'e', 'l', 'l', 'o' }, e[5];

	mcopy(x, y, 5);	//int x[]�� ���� 5���� double d[]�� ����
	mcopy(c, e, 5);	//int c[]�� ���� 5���� char e[]�� ����

	for (int i = 0; i < 5; i++)
		cout << y[i] << ' ';
	cout << endl;
	for (int i = 0; i < 5; i++)
		cout << e[i] << ' ';
	cout << endl;

}