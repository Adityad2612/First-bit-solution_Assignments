#include<iostream>
using namespace std;

int main()
{
	int num = 1;
	int sum = 0;
	
	while(num <= 6)
	{
		sum = sum+num;
		num++;
	}
	cout << "Sum is: " <<sum;
}
