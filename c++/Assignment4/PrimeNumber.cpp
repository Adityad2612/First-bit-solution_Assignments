#include<iostream>
using namespace std;

int main()
{
	int num;
	int i = 2;
	int flag = 0;   //prime
	
	cout << "Enter a number\n";
	cin >> num;
	
	while(i < num)
	{
		if(num % i == 0)
		{
			flag = 1;    //not prime
			break;
		}
		i++;
	} 
	if(flag == 0)
	{
		cout << "Number is prime";
	}
	else
	{
		cout << "Not prime number";
	}
}
