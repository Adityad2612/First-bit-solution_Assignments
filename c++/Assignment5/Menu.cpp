#include<iostream>
using namespace std;

// Function prototypes
int evenodd(int num);
int prime(int num);
int palindrome(int num);
int sign(int num);
int reversenumber(int num);
int sumofdigits(int num);

int main()
{
	int num, choice;

    cout << "Enter a number\n";
    cin >> num;
    
     do {
     	cout << "\n***** MENU *****\n";
     	cout << "1. Check Even or Odd\n";
     	cout << "2. Check Prime or Not\n";
     	cout << "3. Check Palindrome or Not\n";
     	cout << "4. Check Positive/Negative/Zero\n";
     	cout << "5. Reverse Number\n";
     	cout << "6. Sum of Digits\n";
     	cout << "7. Exit\n";
        
        cout << "Enter your choice\n";
        cin >> choice;

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
            cout << "Exiting program...";
        } 
		else 
		{
            cout << "Invalid choice ! Try again";
        }
    } 
	while (choice != 7);   
}

int evenodd(int num)
{
	num = 10;
	if(num % 2 == 0)
	{
	cout << "Number is even";
	}
	else
	{
	cout << "Number is odd";
	}
}

int prime(int num) 
{
	int i = 2;
	int flag = 0;   
	
	cout << "Enter a number\n";
	cin >> num;
	
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
		cout << "Number is prime";
	}
	else
	{
		cout << "Number is not prime";
	}
}

int palindrome(int num)
{
	int r;
	int rev = 0;
	
	cout << "Enter a number\n";
	cin >> num;
	
	int temp = num;
	
	while(num > 0)
	{
		r = num % 10;
		rev = rev * 10 + r;
		num = num / 10;
	}
	if(temp == rev)
	{
		cout << "Number is palindrome";
	}
	else
	{
		cout << "Number is not palindrome";
	}
}

int sign(int num)
{
	if(num > 0)
	{
		cout << "Number is positive";
	}
	else if(num < 0)
	{
		cout << "Number is Negative";
	}
	else 
	{
		cout << "Number is Neutral";
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
    cout << "Reversed number " << rev;
}

int sumofdigits(int num) {
    int sum = 0, digit;
    while (num > 0) 
	{
        digit = num % 10;
        sum = sum + digit;
        num = num / 10;
    }
    cout << "Sum of digit is: " << sum;
}
