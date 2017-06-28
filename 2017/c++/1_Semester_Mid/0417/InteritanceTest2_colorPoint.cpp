#include<iostream>
#include<string>
using namespace std;
class Point{
private:
	int x, y;
public:
	void set(int newX, int newY){
		x = newX;
		y = newY;
	}
	void showPoint(){
		cout << "(" << x << ", " << y << ")" << endl;
	}
};
class ColorPoint :public Point{
private:
	string color;
public:
	void setColor(string newColor){
		color = newColor;
	}
	void ColorPoint::showColorPoint(){
		cout << color << ":";
		showPoint();
	}
};
int main(){
	Point p;
	ColorPoint cp;
	cp.set(3, 4);
	cp.setColor("Red");
	cp.showColorPoint();
}