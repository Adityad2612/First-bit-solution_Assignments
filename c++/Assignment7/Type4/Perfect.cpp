#include<iostream>
using namespace std;

int perfect(int,int,int);
int main()
{
	int num,r;
	int i = 1;
	int sum = 0;
	
	cout << "Enter a number\n";
	cin >> num;
	
	r =perfect(num,i,sum);
	if(r==1)
	cout << "Number is perfect";
	else
	cout << "Number is not perfect";
}
int perfect(int num, int i, int sum)
{
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
		return 1;
	}
	else
	{
		return 2;
	}
}
