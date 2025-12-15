#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str1[50],str2[50];
	int i,flag = 0;
	
	cout << "Enter string\n";
	cin >> str1;
	
	strcpy(str2,str1);
	strrev(str2);
	
	for(i=0;str1[i]!='\0';i++)
	{
		if(str2[i] != str1[i])
		{
		flag = 1;
		break;
		}
	}
	if(flag == 0)
	{
		cout << "String is palindrome";
	}
	else
	{
		cout << "String is not palindrome";
	}
}
