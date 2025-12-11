#include<iostream>
using namespace std;

int main()
{
	int num;
	int i = 1;
	int sum = 0;
	
	cout << "Enter a number\n";
	cin >> num;
	
	while(i < num)
	{
		if(num % i == 0)
		{
		
		sum = sum + i;
	    } 
	    i++;
	}
	if(num == sum)
	{
		printf("Number is perfect number");
	}
	else
	{
		printf("Number is not perfect number");
	}
}
