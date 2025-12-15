#include<iostream>
using namespace std;

int facto(int *num,int *fact);
int main()
{
	int num;
	int fact = 1;
	
	cout << "Enter number\n";
	cin >> num;
	facto(&num,&fact);
}
int facto(int *num, int *fact)
{
	while(*num > 0)
	{
		*fact = *fact * *num;
		(*num)--;
	}
	cout << "Factorial is: " << *fact;
}
