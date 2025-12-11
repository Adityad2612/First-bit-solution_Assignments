#include<iostream>
using namespace std;

int main()
{
	int min, hrs, rmin;
	cout << "Enter minutes\n";
	cin >> min;
	hrs = min / 60;
	rmin = min % 60;
	cout << "After converting minutes into hrs and rem minutes are " << hrs << ":" << rmin;
}
