#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[50];
	int i;
	
	cout << "Enter string\n";
	cin >> str;
	
	for(i=0;i< strlen(str);i++)
	{
		if(str[i] == 'a')
		{
			str[i] = '$';
		}
	}
	for(i=0;i<strlen(str);i++)
	{
		cout << str[i];
	}
}
