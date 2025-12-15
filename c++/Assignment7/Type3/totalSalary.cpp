#include<iostream>
using namespace std;

double salary(double,double,double,double,double);
int main()
{
	double bs;
	double da,ta,hra, total;
	
	cout << "Enter basic salary\n";
	cin >> bs;
	salary(bs,da,ta,hra,total);
}
double salary(double bs,double da,double ta,double hra,double total)
{
	if(bs <= 5000)
	{
		da = bs*0.1;
		ta = bs*0.2;
		hra = bs*0.25;
		total = bs + da + ta + hra;
		cout << "Total salary is: " << total;
	}
	else
	{
		da = bs*0.15;
		ta = bs*0.25;
		hra = bs*0.3;
		total = bs + da + ta + hra;
		cout << "Total salary is: " << total;	
	}
}

