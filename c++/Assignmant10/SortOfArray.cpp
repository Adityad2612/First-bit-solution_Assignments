#include<iostream>
using namespace std;

void sort(int arr[],int n);
int main()
{
	int n,i;
	
	cout << "Enter size of first array\n";
	cin >> n;
	int arr[n];
	
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
	sort(arr,n);
}

void sort(int arr[],int n)
{
	int temp,j,i;
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
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
