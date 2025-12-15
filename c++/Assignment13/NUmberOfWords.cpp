#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char str[50];
    int i,len;

	cout << "Enter string\n";
	cin >> str;

    len = strlen(str);
    
    for(i=0;i<=len;i++)
    {
    	str[i];
	}
	cout << "Number of words present in string: " << i;
}
