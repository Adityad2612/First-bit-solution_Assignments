#include<stdio.h>
#include<string.h>

char* mystrnstr(char *str,char *substr,int n);
void main()
{
	char str[15] = "Aditya";
	char substr[10] = "ditya";
	int n=4;
	mystrnstr(str,substr,n);
}

char* mystrnstr(char *str,char *substr,int n)
{
	int i,j,found=0;
	for(i=0;str[i] !='\0';i++)
	{
		for(j=0;j<n && (substr[j] !='\0' && str[i+j] == substr[j]);j++);

		
		if(substr[j] == '\0')
			{
				found = 1;
				break;
			}
	}
	printf("String: %s\n", str);
    if (found == 1)
        printf("Substring found: %s\n", substr);
    else
        printf("Substring not found\n");
}

