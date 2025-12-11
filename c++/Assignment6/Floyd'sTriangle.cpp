#include<iostream>
using namespace std;

int main()
{
	int i,j;
	int n = 4;
	int num = 1;
	
	for(i = 1; i <= n; i++)
	{
		for(j = 1; j <= i; j++)
		{
			cout << num;
			num++;
		}
		cout << "\n";
	}
}
