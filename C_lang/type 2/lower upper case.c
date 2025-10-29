#include<stdio.h>

int lower();
void main()
{
	int r;
	r =lower();
	if(r == 1)
	printf("Lower");
	else if(r == 2)
	printf("Upper");
	else
	printf("Invalid");
}
int lower()
{
	char alpha = 'A';

    if (alpha >= 'a' && alpha <= 'z') 
	{
        return 1;
    }
    else if (alpha >= 'A' && alpha <= 'Z') 
	{
        return 2;
    }
    else 
	{
        return 3;
    }
}
