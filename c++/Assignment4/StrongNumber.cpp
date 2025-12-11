#include<iostream>
using namespace std;

int main()
{
	int num,fact;
	int sum = 0;
	int i,r;
	
	cout << "Enter a number\n";
	cin >> num;
	
	int temp = num;

	while(num > 0)
	{
		r = num % 10;
		fact = 1;
		i = 1;
		
	while(i <= r)
	{
	fact = fact * i;
	i++;
	}
	
	sum = sum + fact;
	num = num / 10;
	
	}
	
	if(sum == temp)
	{
		cout << "Strong number";
	}
	else
	{
		cout << "Not strong number";
	}
}
