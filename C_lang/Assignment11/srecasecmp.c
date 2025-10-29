#include<stdio.h>
#include<string.h>

void main()
{
	printf("%d\n", strcasecmp("aditya", "Durgude"));  
    printf("%d\n", strcasecmp("aditya", "aditya"));
    printf("%d\n", strcasecmp("durgude", "aditya"));
}
