#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char str[50], newstr[50];
    
    cout << "Enter string\n";
	cin >> str;  // reads until space
    
    strcpy(newstr, str);  // copy original string

    int len = strlen(newstr);

    if(len > 1) {
        char temp = newstr[0];
        newstr[0] = newstr[len-1];
        newstr[len-1] = temp;
    }

    cout << "Original string: " << str;
    cout << "\n" << "New string after swapping first and last: " << newstr;

}

