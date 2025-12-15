#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str1[] = "Aditya";
	char str2[] = "Durgude";
	strcat(str1,str2);
	cout << "String after adding: " << str1;
}
