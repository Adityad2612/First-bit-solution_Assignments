#include<stdio.h>

void main()
{
	int num, choice;

    printf("Enter a number: ");
    scanf("%d", &num);
    
     do {
        printf("\n***** MENU *****\n");
        printf("1. Check Even or Odd\n");
        printf("2. Check Prime or Not\n");
        printf("3. Check Palindrome or Not\n");
        printf("4. Check Positive/Negative/Zero\n");
        printf("5. Reverse Number\n");
        printf("6. Sum of Digits\n");
        printf("7. Exit\n");
        
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1) 
		{
            evenodd(num);
        } 
		else if (choice == 2) 
		{
            prime(num);
        } 
		else if (choice == 3) 
		{
            palindrome(num);
        } 
		else if (choice == 4) 
		{
            sign(num);
        } 
		else if (choice == 5) 
		{
            reversenumber(num);
        } 
		else if (choice == 6) 
		{
            sumofdigits(num);
        } 
		else if (choice == 7) 
		{
            printf("Exiting program...\n");
        } 
		else 
		{
            printf("Invalid choice! Try again.\n");
        }
    } 
	while (choice != 7);   
}

int evenodd(int num)
{
	num = 10;
	if(num % 2 == 0)
	{
	printf("Number is Even");
	}
	else
	{
	printf("Number is Odd");
	}
}

int prime(int num) 
{
	int i = 2;
	int flag = 0;   
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	while(i < num)
	{
		if(num % i == 0)
		{
			flag = 1;    
			break;
		}
		i++;
	} 
	if(flag == 0)
	{
		printf("Number is prime");
	}
	else
	{
		printf("Number is not prime");
	}
}

int palindrome(int num)
{
	int r;
	int rev = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	int temp = num;
	
	while(num > 0)
	{
		r = num % 10;
		rev = rev * 10 + r;
		num = num / 10;
	}
	if(temp == rev)
	{
		printf("Number is palindrome");
	}
	else
	{
		printf("Number is not palindrome");
	}
}

int sign(int num)
{
	if(num > 0)
	{
		printf("Number is positive");
	}
	else if(num < 0)
	{
		printf("Number is negative");
	}
	else 
	{
		printf("Number is neutral");
	}
}

int reversenumber(int num) 
{
    int rev = 0, digit;
    while (num != 0) 
	{
        digit = num % 10;
        rev = rev * 10 + digit;
        num = num / 10;
    }
    printf("Reversed number: %d\n", rev);
}

int sumofdigits(int num) {
    int sum = 0, digit;
    while (num > 0) 
	{
        digit = num % 10;
        sum = sum + digit;
        num = num / 10;
    }
    printf("Sum of digits = %d\n", sum);
}
