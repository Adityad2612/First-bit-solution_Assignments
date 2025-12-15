#include<iostream>
using namespace std;

void evenodd(int arr[],int n);
int main()
{
	int n,i;
	
	cout << "Enter size of array\n";
	cin >> n;
	int arr[n];
	
	cout << "Enter elements in array\n";
	for(i=0;i<n;i++)
	{
		cin >> arr[i];
	}
	cout << "\nElements in array\n";
	for(i=0;i<n;i++)
	{
		cout << " " << arr[i];
	}
	evenodd(arr,n);
}

void evenodd(int arr[],int n)
{
	int i,j;
	cout << "\nEven numbers are\n";
	for(i=0;i<n;i++)
	{
		if(arr[i] % 2 == 0)
		{
			cout << " " << arr[i];
		}
	}
	
	cout << "\nOdd numbers are\n";
	for(j=0;j<n;j++)
	{
		if(arr[j] % 2 != 0)
		{
			cout << " " << arr[j];
		}
	}
}
