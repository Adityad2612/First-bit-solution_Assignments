#include<stdio.h>
#include<string.h>
void main()
{
    char str[50];
    int i,len;

    printf("Enter a string\n");
    scanf("%s", str);

    len = strlen(str);
    
    for(i=0;i<=len;i++)
    {
    	str[i];
	}
	printf("Number of words present in string is %d",i);
}
