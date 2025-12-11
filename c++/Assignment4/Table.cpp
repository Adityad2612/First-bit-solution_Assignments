#include<iostream>
using namespace std;

int main()
{
	int table = 1;
	int num;
	
	cout << "Enter a number\n";
	cin >> num;
	
	cout << "Table of " << num << " is:\n";
	
	while(table <= 10)
	{
		cout << "\n" << table*num;
		table++;
	}
}
