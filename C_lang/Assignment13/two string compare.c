#include<stdio.h>
#include<string.h>
void main()
{
    char str1[50],str2[50];
    int i,len1,len2;

    printf("Enter first string\n");
    scanf("%s", str1);
    
    printf("Enter second string\n");
    scanf("%s", str2);
    
    for(i=0;str1[i]!='\0';i++)
    {
    	len1++;
	}
    for(i=0;str2[i]!='\0';i++)
    {
    	len2++;
	}
    
    if(len1 > len2)
    {
        printf("Larger string %s\n", str1);
    }
    else if(len2 > len1)
    {
        printf("Larger string %s\n", str2);
    }
    else
    {
        printf("Both strings are of equal length\n");
    }
}
