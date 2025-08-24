#include<stdio.h>
void main()
{
	int area, len, wid, per;
	
	len = 24, wid = 12; 
	area = len * wid;
	per = 2*(len + wid);
	printf("Area of rectangle is %d", area);
	printf("\nPerimeter of reactangle is %d", per);
}
