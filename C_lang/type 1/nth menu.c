#include<stdio.h>

void evenodd();
void prime();
void palindrome();
void sign();
void reversenumber();
void sumofdigits();
void main()
{
	evenodd();
	prime();
	palindrome();
	sign();
	reversenumber();
	sumofdigits();
	
	int num, choice;

    
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
            evenodd();
        } 
		else if (choice == 2) 
		{
            prime();
        } 
		else if (choice == 3) 
		{
            palindrome();
        } 
		else if (choice == 4) 
		{
            sign();
        } 
		else if (choice == 5) 
		{
            reversenumber();
        } 
		else if (choice == 6) 
		{
            sumofdigits();
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

void evenodd()
{
	int num;
	printf("Enter a number: ");
    scanf("%d", &num);
	if(num % 2 == 0)
	{
	printf("Number is Even");
	}
	else
	{
	printf("Number is Odd");
	}
}

void prime() 
{
	int i = 2,flag = 0;
	int num;
	printf("Enter a number: ");
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

void palindrome()
{
	int num;
	int r;
	int rev = 0;
	printf("Enter a number: ");
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

void sign()
{
	int num;
	printf("Enter a number: ");
    scanf("%d", &num);
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

void reversenumber() 
{
    int rev = 0, digit, num;
    printf("Enter a number: ");
    scanf("%d", &num);
    while (num != 0) 
	{
        digit = num % 10;
        rev = rev * 10 + digit;
        num = num / 10;
    }
    printf("Reversed number: %d\n", rev);
}

void sumofdigits() {
    int sum = 0, digit,num;
    printf("Enter a number: ");
    scanf("%d", &num);
    while (num > 0) 
	{
        digit = num % 10;
        sum = sum + digit;
        num = num / 10;
    }
    printf("Sum of digits = %d\n", sum);
}


