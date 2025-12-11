#include <iostream>
using namespace std;

int main() 
{
    int n, i,j, temp, digit, sum, fact;

   cout << "Enter nth number\n";
   cin >> n;

	cout << "Strong numbers between 1 and " << n << " are\n";
	
    for (i = 1; i <= n; i++) 
	{
        temp = i;
        sum = 0;

        while (temp > 0) 
		{
            digit = temp % 10;

            fact = 1;
            for (j = 1; j <= digit; j++) 
			{
                fact = fact * j;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == i) 
		{
            cout << "\n" << i;
        }
    }
}

