#include<iostream>
using namespace std;

int palin(int,int,int,int,int,int);
int main()
{
	int num, r2, q1, rev, r3,r1;
	
	cout << "Enter number\n";
	cin >> num;
	
	palin(num,r2,q1,rev,r3,r1);
}
int palin(int num, int r2, int q1, int rev, int r3,int r1)
{
	r1 = num % 10;
	q1 = num / 10;
	r2 = q1 % 10;
	r3 = q1 / 10;
	
	rev = r1*100 + r2*10 + r3;
	
	if(num == rev)
	{
		cout << "Number is palindrome";
	}
	else
	{
		cout << "Number is not palindrome";
	}
}
