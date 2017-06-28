#include <iostream>
using namespace std;
template <class T>	//class ¶Ç´Â typename
T get_max(T x, T y){
	if (x > y) return x;
	else return y;
}
int main(){
	cout << get_max<int>(1, 3) << endl;
	cout << get_max<double>(1.2, 3.9) << endl;
	return 0;
}