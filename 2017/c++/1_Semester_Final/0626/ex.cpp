#include <iostream>
using namespace std;
template <class T1,class T2>	//class �Ǵ� typename
void ShowData(double num){
	cout << (T1)num << ", " << (T2)num << endl;
}
int main(){
	ShowData<char,int>(65);
	ShowData<char, int>(67);
	ShowData<char, double>(68.9);
	ShowData<int ,double>(70.4);
	return 0;
}