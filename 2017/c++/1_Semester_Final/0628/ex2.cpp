#include <iostream>
using namespace std;
template <typename T1, typename T2>
class Box2{
	T1 firstData;
	T2 secondData;
public:
	T1 getFirst(){
		return firstData;
	}
	T2 getSecond(){
		return secondData;
	}
	void setFirst(T1 value){
		firstData = value;
	}
	void setSecond(T2 value){
		secondData = value;
	}
};
int main(){
	Box2<int, double> b;
	b.setFirst(10);
	b.setSecond(3.14);
	cout << b.getFirst() << "," << b.getSecond() << endl;
}