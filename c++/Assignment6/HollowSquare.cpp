#include<iostream>
using namespace std;

int main()
{
	int i,j;
	int n = 4;
	
	for(i = 1; i<=n; i++)
	{
		for(j = 1; j <= n; j++)
		{
			if(i == 1 || j == 1|| i == 4 || j == n)
			{
				cout << "*";
			}
			else
			{
				cout << " ";
			}
		}
		cout << "\n";
	}
}
