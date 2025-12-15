#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[] = "Aditya";
	char *ptr = strchr(str,'i');
	cout << ptr;
}
