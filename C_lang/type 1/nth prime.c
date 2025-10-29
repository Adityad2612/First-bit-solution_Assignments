#include<stdio.h>

void prime();
void main()
{
	prime();
}

void prime()
{
	int i,j,n,flag;
	int sum = 0;
	
	printf("Enter nth number\n");
	scanf("%d", &n);
	
	printf("Primes numbers from 1 to %d are\n", n);
	for(i = 2; i<n;i++)
	{
		flag = 0;    //prime
		
		for (j = 2; j < i; j++) 
		{
            if (i % j == 0) 
			{  
                flag = 1;    //not prime
                break;
            }
        }
        if(flag == 0)
	    {
		printf("%d ", i);
	    }
	}
}
