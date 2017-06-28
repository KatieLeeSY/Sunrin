#include <iostream>
#include <string>
using namespace std;
class Date{
public:
	void printDate(){
		cout << year << "." << month << "." << day << endl;
	}
	int getDay(){
		return day;
	}
	int year;
	string month;
	int day;
};
int main(){

}