#include<iostream>
using namespace std;

int prime(int,int,int);
int main()
{
	int num,r;
	int i = 2;
	int flag = 0;   
	
	cout << "Enter number\n";
	cin >> num;
	r =prime(num,i,flag);
	if(r==1)
	cout << "Number is prime";
	else
	cout << "Number is not prime";
}
int prime(int num, int i, int flag)
{
	while(i < num)
	{
		if(num % i == 0)
		{
			flag = 1;    
			break;
		}
		i++;
	} 
	if(flag == 0)
	{
		return 1;
	}
	else
	{
		return 2;
	}
}
