#include<iostream>
using namespace std;

int main()
{
	int n1,n2,i,j;
	int *crr = new int[n1 + n2];
	
	cout << "Enter size of first array\n";
	cin >> n1;
	int *arr = new int[n1];
	
	cout << "Enter elements in first array\n";
	for(i=0;i<n1;i++)
	{
		cin >> arr[i];
	}
	cout << "\nElements in first array\n";
	for(i=0;i<n1;i++)
	{
		cout << " " << arr[i];
	}
	// second array
	cout << "\nEnter size of second array\n";
	cin >> n2;
	int *brr = new int[n2];
	
	cout << "Enter elements in second array\n";
	for(i=0;i<n2;i++)
	{
		cin >> brr[i];
	}
	cout << "\nElements in second array\n";
	for(i=0;i<n2;i++)
	{
		cout << " " << brr[i];
	}
	
	for(i=0;i<n1;i++)
	{
		crr[i] = arr[i];
	}
	for(j=0;j<n2;j++)
	{
		crr[i] = brr[j];
		i++;
	}
	
	cout << "\nMerged array\n";
	for(i=0;i<n1+n2;i++)
	{
		cout << " " << crr[i];
	}
}
