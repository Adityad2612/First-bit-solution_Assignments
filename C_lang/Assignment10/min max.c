#include<stdio.h>

void main()
{
	int n,i;
	
	printf("Enter size of array\n");
	scanf("%d",&n);
	int arr[n];
	
	printf("Enter elements in array\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\nElements in array\n");
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	
	minmax(arr,n);
}

minmax(int arr[],int n)
{
	int i;
	int min = arr[0],max = arr[0];
	for(i=1;i<n;i++)
	{
		if(arr[i] < min)
		min = arr[i];
		if(arr[i] > max)
		max = arr[i];
	}
	printf("\nMinimum number is %d",min);
	printf("\nMaximum number is %d",max);
}
