#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[] = "Aditya Durgude";
	char dest[20];
	strcpy(dest,str);
	cout << "String after copied:" << dest;
}
