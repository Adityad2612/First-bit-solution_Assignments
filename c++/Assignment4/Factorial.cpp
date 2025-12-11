#include<iostream>
using namespace std;

int main()
{
	int num;
	int fact = 1;
	
	cout << "Enter a number\n";
	cin >> num;
	
	while(num > 0)
	{
		fact = fact * num;
		num--;
	}
	cout << "Factorial is: " << fact;
}
