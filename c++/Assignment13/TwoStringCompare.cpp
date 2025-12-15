#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char str1[50],str2[50];
    int i,len1,len2;

    cout << "Enter first string\n";
	cin >> str1;
    
    cout << "Enter second string\n";
	cin >> str2;
    
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
        cout << "Larger string " << str1;
    }
    else if(len2 > len1)
    {
        cout << "Larger string " << str2;
    }
    else
    {
        cout << "Both strings are equal";
    }
}
