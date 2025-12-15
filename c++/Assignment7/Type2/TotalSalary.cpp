#include<iostream>
using namespace std;

int salary();
int main()
{
	int r;
	r =salary();
	if(r == 1)
	cout << "Total salary is: " << r;
	else
	cout << "Total salary is: " << r;
}
int salary()
{
	double bs = 2000;
	double da; double ta; double hra;double total;
	if(bs <= 5000)
	{
		da = bs*0.1;
		ta = bs*0.2;
		hra = bs*0.25;
		return bs + da + ta + hra;
	}
	else
	{
		da = bs*0.15;
		ta = bs*0.25;
		hra = bs*0.3;
		return bs + da + ta + hra;	
	}
}
