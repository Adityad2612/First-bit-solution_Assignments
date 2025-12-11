#include<iostream>
using namespace std;

int main()
{
	int area, base, height;
	cout << "Enter base\n";
	cin >> base;
	
	cout << "Enter height\n";
	cin >> height;
	
	area = base * height / 2;
	cout << "Area of triangle is " << area;
}
