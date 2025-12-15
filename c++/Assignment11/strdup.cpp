#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[] = "Aditya";
	char *dup = strdup(str);
	cout << "Original: " << str;
	cout << "\n" << "Duplicate: " << dup;
}
