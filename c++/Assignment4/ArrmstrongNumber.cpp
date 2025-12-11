#include<iostream>
using namespace std;

int main()
{
	int num;
	int r;
	int sum = 0;
	
	cout << "Enter a number\n";
	cin >> num;
	int temp = num;
	
	while(num > 0)
	{
	
	r = num % 10;
	sum = (sum + r*r*r);
	num = num / 10;
}	
	if(temp == sum)
	{
		cout << "Number is armstrong";
	}
	else
	{
		cout << "Number is not armstrong";
	}
}
