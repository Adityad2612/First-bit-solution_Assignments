#include<stdio.h>
#include<stdlib.h>

void main()
{
	int n1,n2,i,j;
	int *crr = (int*)malloc(n1 * sizeof(int) + n2* sizeof(int));
	
	printf("Enter size of first array\n");
	scanf("%d",&n1);
	int *arr = (int*)malloc(n1 * sizeof(int));
	
	printf("Enter elements in first array\n");
	for(i=0;i<n1;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Elements in first array are\n");
	for(i=0;i<n1;i++)
	{
		printf("%d ",arr[i]);
	}
	// second array
	printf("\nEnter size of second array\n");
	scanf("%d",&n2);
	int *brr = (int*)malloc(n2 * sizeof(int));

	
	printf("Enter elements in second array\n");
	for(i=0;i<n2;i++)
	{
		scanf("%d",&brr[i]);
	}
	printf("Elements in second array are\n");
	for(i=0;i<n2;i++)
	{
		printf("%d ",brr[i]);
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
	
	printf("\nmerged array\n");
	for(i=0;i<n1+n2;i++)
	{
		printf("%d ",crr[i]);
	}
}
