#include<stdio.h>

char lower(char);
void main()
{
	int r;
	char alpha;
	
	printf("Enter a alphabet\n");
	scanf("%c", &alpha);
	
	r =lower(alpha);
	
	if(r == 1)
	printf("Lower case");
	else if(r == 2)
	printf("Upper case");
	else
	printf("Invalid input");
}
char lower(char alpha)
{
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
