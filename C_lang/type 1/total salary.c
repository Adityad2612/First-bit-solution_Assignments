#include<stdio.h>

void total_salary();
void main()
{
	total_salary();
}
void total_salary()
{
	double bs = 2000;
	double da; double ta; double hra;double total;
	if(bs <= 5000)
	{
		da = bs*0.1;
		ta = bs*0.2;
		hra = bs*0.25;
		total = bs + da + ta + hra;
		printf("%lf", total);
	}
	else
	{
		da = bs*0.15;
		ta = bs*0.25;
		hra = bs*0.3;
		total = bs + da + ta + hra;
		printf("%lf", total);	
	}
}
