#include<iostream>
using namespace std;

int main()
{
	int num;
	
	cout << "Enter a number\n";
	cin >> num;
	
	if(num % 3 == 0 && num % 5 == 0)
	{
		cout << "Number is divided by both 3 & 5";
	}
	else if(num % 3 == 0)
	   {
			cout << "NUmber is divided by 3";
		}
		else if(num % 5 == 0)
		{
			cout << "Number is divided by 5";
		}
		else
		{
			cout << "Neither divided by both numbers";
		}
	
}
