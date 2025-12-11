#include <iostream>
#include <math.h>
using namespace std;

int main() {
    int n, i, temp, rem, digits,num;
    int sum;

    cout << "Enter nth number\n";
    cin >> n;

	cout << "Armstrong numbers between 1 and " << n << " are\n";

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
            cout << "\n" << i;
        }
    }
}

