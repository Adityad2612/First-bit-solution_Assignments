#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str1[] = "Aditya";
	char str2[] = "Durgude";
	strncat(str1,str2,6);
	cout << "String after adding: " << str1;
}
