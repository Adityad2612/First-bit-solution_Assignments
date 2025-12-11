#include<iostream>
using namespace std;

int main()
{
	int num1; int num2; int num3;
	cout << "Enter first number\n";
	cin >> num1;
	
	cout << "Enter second number\n";
	cin >> num2;
	
	cout << "Enter third number\n";
	cin >> num3;
	
	if(num1 > num2)
	{
		cout << "Number one is greater";
	}
	else if(num2 > num3)
	{
		cout << "Number two is greater";
	}
	else if(num3 > num1)
	{
		cout << "Number three is greater";
	}
}
