#include<iostream>
using namespace std;

int main()
{
	int num;
	int r,r1;
	
	cout << "Enter number\n";
	cin >> num;
	
	r = num % 10;
	r1 = num;
	while(r1 >= 10)
	{
		r1 = r1 / 10;
	}
	cout << "Sum of first and last number is: " << r+r1;
}
