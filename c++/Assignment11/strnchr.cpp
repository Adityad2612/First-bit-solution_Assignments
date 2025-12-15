#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[] = "India";
	char *ptr = strrchr(str,'i');
	cout << ptr;
}
