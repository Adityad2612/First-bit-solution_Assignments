#include<iostream>
using namespace std;

int main()
{
	double bs;
	cout << "Enter base salary\n";
	cin >> bs;
	double da,ta,hra,total;
	if(bs <= 5000)
	{
		da = bs*0.1;
		ta = bs*0.2;
		hra = bs*0.25;
		total = bs + da + ta + hra;
		cout << "Total salary: " << total;
	}
	else
	{
		da = bs*0.15;
		ta = bs*0.25;
		hra = bs*0.3;
		total = bs + da + ta + hra;
		cout << "Total salary: " << total;	
	}
}
