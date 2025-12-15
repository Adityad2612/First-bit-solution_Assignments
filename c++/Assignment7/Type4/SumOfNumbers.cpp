#include<iostream>
using namespace std;

int summ(int,int);
int main()
{
	int num = 1,r;
	int sum = 0;
	
	r =summ(num,sum);
	cout << "Sum of number is: " << r;
}
int summ(int num, int sum)
{
	while(num <= 5)
	{
		sum = sum+num;
		num++;
	}
	return sum;
}
