#include<iostream>
using namespace std;

int main()
{
	int n,i;
	int *crr = new int[n];
	
	cout << "Enter size of first array\n";
	cin >> n;
	int *arr = new int[n];
	
	cout << "Enter elements in first array\n";
	for(i=0;i<n;i++)
	{
		cin >> arr[i];
	}
	cout << "Elements in first array is\n";
	for(i=0;i<n;i++)
	{
		cout << " " << arr[i];
	}
	////
	cout << "\nEnter size of second array\n";
	scanf("%d",&n);
	int *brr = new int[n];
	
	cout << "Enter elements in second array\n";
	for(i=0;i<n;i++)
	{
		cin >> brr[i];
	}
	cout << "Elements in second array is\n";
	for(i=0;i<n;i++)
	{
		cout << " " << brr[i];
	}
	
	cout << "\nSum of two array are\n";
	for(i=0;i<n;i++)
	{
		crr[i] = arr[i] + brr[i];
		cout << " " << crr[i];
	}
	
}
