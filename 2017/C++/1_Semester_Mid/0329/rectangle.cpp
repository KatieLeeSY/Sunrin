#include<iostream>
#include<string>
using namespace std;
class Rectangle{
public:
	int width;
	int height;
	string color;
public:
	//접근자
	int getWidth(){
		return width;
	}
	//설정자
	void setWidth(int w){
		width = w;
	}
	int getHeight(){
		return height;
	}
	void setHeight(int h){
		height = h;
	}
	int getArea(){
		return width*height;
	}
};
int main(){
	Rectangle rect;
	rect.setWidth(3);
	rect.setHeight(5);
	cout << "사각형의 면적은 " << rect.getArea() << endl;
}