#include<iostream>
using namespace std;

void summ(int arr[], int n);
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
	int sum = 0;
	
	summ(arr,n);
}

void summ(int arr[],int n)
{
	int i,sum = 0;
	cout << "\nSum of elements of array is:\n";
	
	for(i=0;i<n;i++)
	{
		sum = sum + arr[i];
	}
	cout << sum;
}
