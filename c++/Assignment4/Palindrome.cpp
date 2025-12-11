#include<iostream>
using namespace std;

int main()
{
	int num;
	int r;
	int rev = 0;
	
	cout << "Enter a number\n";
	cin >> num;
	
	int temp = num;
	
	while(num > 0)
	{
		r = num % 10;
		rev = rev * 10 + r;
		num = num / 10;
	}
	if(temp == rev)
	{
		cout << "Number is palindrome";
	}
	else
	{
		cout << "Number is not palindrome";
	}
}
