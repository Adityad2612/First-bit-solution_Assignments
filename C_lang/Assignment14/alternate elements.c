#include<stdio.h>
#include<stdlib.h>

void main()
{
	int n,i;
	
	printf("Enter size of array\n");
	scanf("%d",&n);
	int *arr = (int*)malloc(n*sizeof(int));
	
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
	printf("\nAlternate elements are:\n");
	for(i=0;i<n;i++)
	{
	    if(i%2 !=0)
	    {
	    	printf("%d ",arr[i]);
		}
	}
}
