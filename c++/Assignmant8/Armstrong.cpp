#include<iostream>
using namespace std;

int arm(int *num, int *r, int *sum,int *temp);
int main()
{
	int num;
	int r;
	int sum = 0;
	
	cout << "Enter number\n";
	cin >> num;
	int temp = num;
	arm(&num,&r,&sum,&temp);
}
int arm(int *num, int *r, int *sum,int *temp)
{
	while(*num > 0)
	{
	*r = *num % 10;
	*sum = (*sum + *r**r**r);
	*num = *num / 10;
}
	
	if(*temp == *sum)
	{
		cout << "Armstrong number";
	}
	else
	{
		cout << "not armstrong number";
	}
}

