#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[] = "Apple,Banana,Grapes";
	char *token = strtok(str,",");
	while(token != '\0')
	{
		cout << "\n" <<  token;
		token = strtok(NULL,",");
	}
}
