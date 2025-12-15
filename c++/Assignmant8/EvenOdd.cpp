#include<iostream>
using namespace std;

int evenodd(int *num);
int main()
{
	int num;
	
	cout << "Enter number\n";
	cin >> num;
	
	evenodd(&num);
}
int evenodd(int *num)
{
	if(*num % 2 == 0)
	{
	cout << "Number is even";
	}
	else
	{
	cout << "Number is odd";
	}
}
