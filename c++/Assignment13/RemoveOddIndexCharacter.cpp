#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char str[50];
    int i, j, len;

    cout << "Enter string\n";
	cin >> str;

    len = strlen(str);

    for(i = 1; i < len; i++)
    {
        for(j = i; j < len; j++)
        {
            str[j] = str[j+1];  
        }
        len--;   
    }

    cout << "String after removing odd-index characters " << str;
}

