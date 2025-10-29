#include<stdio.h>

int salary();
void main()
{int r;
	r =salary();
	if(r == 1)
	printf("%d",r);
	else
	printf("%d",r);
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
		printf("%lf", total);
	}
	else
	{
		da = bs*0.15;
		ta = bs*0.25;
		hra = bs*0.3;
		return bs + da + ta + hra;
		printf("%lf", total);	
	}
}
