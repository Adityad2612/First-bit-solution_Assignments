#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[] = "Aditya Durgude";
	char dest[20];
	strncpy(dest,str,9);
	dest[9] = '\0';
	cout << "String after copied " << dest;
}
