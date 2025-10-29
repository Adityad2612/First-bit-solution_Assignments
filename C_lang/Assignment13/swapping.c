#include <stdio.h>
#include <string.h>

void main()
{
    char str[50], newstr[50];
    
    printf("Enter a string: ");
    scanf("%s", str);  // reads until space
    
    strcpy(newstr, str);  // copy original string

    int len = strlen(newstr);

    if(len > 1) {
        char temp = newstr[0];
        newstr[0] = newstr[len-1];
        newstr[len-1] = temp;
    }

    printf("Original string: %s\n", str);
    printf("New string after swapping first and last: %s\n", newstr);

    return 0;
}

