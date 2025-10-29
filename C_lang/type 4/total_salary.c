#include<stdio.h>

double salary(double,double,double,double,double);
void main()
{
	double r;
	double bs;
	double da,ta,hra, total;
	
	printf("Enter basic salary");
	scanf("%lf", &bs);
	r =salary(bs,da,ta,hra,total);
	printf("%lf",r);
}
double salary(double bs,double da,double ta,double hra,double total)
{
	if(bs <= 5000)
	{
		da = bs*0.1;
		ta = bs*0.2;
		hra = bs*0.25;
		total = bs + da + ta + hra;
		return total;
	}
	else
	{
		da = bs*0.15;
		ta = bs*0.25;
		hra = bs*0.3;
		total = bs + da + ta + hra;
		return total;	
	}
}

