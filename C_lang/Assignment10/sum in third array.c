#include<stdio.h>

void main()
{
	int n,i;
	int crr[n];
	
	printf("Enter size of first array\n");
	scanf("%d",&n);
	int arr[n];
	
	printf("Enter elements in first array\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Elements in first array are\n");
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	////
	printf("\nEnter size of second array\n");
	scanf("%d",&n);
	int brr[n];
	
	printf("Enter elements in second array\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&brr[i]);
	}
	printf("Elements in second array are\n");
	for(i=0;i<n;i++)
	{
		printf("%d ",brr[i]);
	}
	
	sum(arr,brr,crr,n);	
}

sum(int arr[],int brr[], int crr[], int n)
{
	int i;
	printf("\nsum of two array are\n");
	for(i=0;i<n;i++)
	{
		crr[i] = arr[i] + brr[i];
		printf("%d ",crr[i]);
	}
}
