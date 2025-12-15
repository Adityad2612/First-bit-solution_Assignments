#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	cout << "\n" << strncmp("Aditya", "Durgude",2);
	cout << "\n" << strncmp("aditya", "aditya",5);
	cout << "\n" << strncmp("durgude", "Aditya",3);
}
