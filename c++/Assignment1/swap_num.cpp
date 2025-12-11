#include<iostream>
using namespace std;

int main()
{
	int a, b, c;
	cout << "Enter value a\n";
	cin >> a;
	
	cout << "Enter value of b\n";
	cin >> b;
	c = a;
	a = b;
	b = c;
	cout << "After Swapping two numbers are " << a << ""<< b;
}
