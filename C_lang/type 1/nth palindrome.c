#include<stdio.h>
#include<math.h>

void palindrome();
void main()
{
	palindrome();
}

void palindrome()
{
	 int n, i, temp, rem, digits,num;
    int sum;

    printf("Enter nth value");
    scanf("%d", &n);

    printf("Armstrong numbers between 1 and %d are\n", n);

    for (i = 1; i <= n; i++) {
        temp = i;
        sum = 0;

        digits = 0;
        num = i;
        while (num > 0) 
		{
            num = num/ 10;
            digits++;
        }
        num = i;
        while (num > 0) 
		{
            rem = num % 10;
            sum = sum+ pow(rem, digits);
            num = num/ 10;
        }
        if (sum == i) 
		{
            printf("%d ", i);
        }
    }
}
