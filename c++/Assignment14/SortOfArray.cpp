#include<iostream>
using namespace std;

int main()
{
	int n,i;
	
	cout << "Enter size of first array\n";
	cin >> n;
	int *arr = new int[n];
	
	cout << "Enter elements in array\n";
	for(i=0;i<n;i++)
	{
		cin >> arr[i];
	}
	cout << "\nElements in array are\n";
	for(i=0;i<n;i++)
	{
		cout << " " << arr[i];
	}
	int temp,j;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-1;j++)
		{
			if(arr[j] > arr[j+1])
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	cout << "\nArray sorting\n";
	for(i=0;i<n;i++)
	{
		cout << " " << arr[i];
	}
}
