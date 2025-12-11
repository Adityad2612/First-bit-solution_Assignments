#include<iostream>
using namespace std;

int main()
{
	int area, len, wid, per;
	cout << "Enter length\n";
	cin >> len;
	
	cout << "Enter width\n";
	cin >> wid;
	
	area = len * wid;
	per = 2*(len + wid);
	cout << "Area of rectangle is " << area;
	cout << "\nPerimeter of rectangle is " << per;
}


