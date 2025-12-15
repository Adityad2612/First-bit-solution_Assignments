#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[50],ch;
	int i,len;
	
	cout << "Enter string\n";
	cin.getline(str, 50);
	len = strlen(str);
	
	for(i = 0;i<len;i++)
	{
		if(str[i] == ' ')
		{
			str[i] = '#';
		}
	}
	cout << "Replacing every blank sapce " << str;
}
