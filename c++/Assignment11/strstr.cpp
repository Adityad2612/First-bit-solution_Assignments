#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[] = "Aditya";
	char *sub = strstr(str,"dit");
	cout << sub;
}
