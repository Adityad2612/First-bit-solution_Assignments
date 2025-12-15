#include<iostream>
using namespace std;

void sum(int *num,int *r,int *r1);
int main()
{
	int num;
	int r,r1;
	
	cout << "Enter number\n";
	cin >> num;
	sum(&num,&r,&r1);
}
void sum(int *num, int *r, int *r1)
{
	*r = *num % 10;
	while(*num >= 10)
	{
		*num = *num / 10;
	}
	*r1 = *num;
	cout << "Sum of first and last number is: " << *r+(*r1);
}
