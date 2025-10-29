#include<stdio.h>

char lower(char);
void main()
{
	char alpha;
	
	printf("Enter a alphabet\n");
	scanf("%c", &alpha);
	
	lower(alpha);
}
char lower(char alpha)
{
	if (alpha >= 'a' && alpha <= 'z') 
	{
        printf("Lowercase");
    }
    else if (alpha >= 'A' && alpha <= 'Z') 
	{
        printf("Uppercase");
    }
    else 
	{
        printf("Not an alphabet");
    }
}
