#include <stdio.h>
#include <string.h>

void main()
{
    char str[50];
    int i, j, len;

    printf("Enter a string\n");
    scanf("%s", str);

    len = strlen(str);

    for(i = 1; i < len; i++)
    {
        for(j = i; j < len; j++)
        {
            str[j] = str[j+1];  
        }
        len--;   
    }

    printf("String after removing odd-index characters %s\n", str);
}

