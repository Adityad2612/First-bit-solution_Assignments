#include<stdio.h>
#include<string.h>

char* mystrstr(char *str,char *substr);
void main()
{
	char str[15] = "Aditya";
	char substr[10] = "ity";
	
	mystrstr(str,substr);
}

char* mystrstr(char *str,char *substr)
{
	int i,j,found=0;
	for(i=0;str[i] !='\0';i++)
	{
		for(j=0;substr[j] !='\0' && str[i+j] == substr[j];j++);

		
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

