#include<iostream>
using namespace std;

int main()
{
	int i,j;
	int n = 4;
	
	for(i =1; i <=n; i++)
	{
		for(j = 1; j <=i; j++)
		{
			cout << "*";
		}
		cout << "\n";
	}
			for(i = n-1; i>=1; i--)
			{
				for(j = 1; j <=i;j++ )
				{
					cout << "*";
				}
				cout << "\n";
			}
}
