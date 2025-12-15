#include<iostream>
using namespace std;

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
	cout << "\nEven numbers are\n";
	for(i=0;i<n;i++)
	{
		if(arr[i] % 2 == 0)
		{
			cout << " " << arr[i];
		}
	}
	int j;
	cout << "\nOdd numbers are\n";
	for(j=0;j<n;j++)
	{
		if(arr[j] % 2 != 0)
		{
			cout << " " << arr[j];
		}
	}
}
