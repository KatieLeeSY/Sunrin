#include<iostream>
#include<string>
using namespace std;

class Movie{
private:
	string title;
	int length, rating;
public:
	Movie(string in_title, int in_length, int in_rating) :title(in_title), length(in_length), rating(in_rating){}
	void print_info();
};
void Movie::print_info(){
	cout << "==========================" << endl;
	cout << "Movie: " << title << "\n상영시간: " << length << ", 평가: " << rating << endl;
	cout << "==========================" << endl;
}
int main(){
	Movie movie("스타워즈", 180, 90);
	movie.print_info();
}