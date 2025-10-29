#include<stdio.h>
#include<stdlib.h>

void main()
{
	int n,i;
	int *crr = (int*)malloc(n*sizeof(int));
	
	printf("Enter size of first array\n");
	scanf("%d",&n);
	int *arr = (int*)malloc(n*sizeof(int));
	
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
	//second array
	printf("\nEnter size of second array\n");
	scanf("%d",&n);
	int *brr = (int*)malloc(n*sizeof(int));
	
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
	
	printf("\nsum of two array are\n");
	for(i=0;i<n;i++)
	{
		crr[i] = arr[i] + brr[i];
		printf("%d ",crr[i]);
	}
	
}
