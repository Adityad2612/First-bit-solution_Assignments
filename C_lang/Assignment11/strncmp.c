#include<stdio.h>
#include<string.h>

void main()
{
	printf("%d\n",strncmp("Aditya", "Durgude",2));  
    printf("%d\n", strncmp("aditya", "aditya",5));
    printf("%d\n", strncmp("durgude", "Aditya",3));
}
