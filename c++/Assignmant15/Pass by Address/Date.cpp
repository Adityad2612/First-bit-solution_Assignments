#include<iostream>
using namespace std;

struct Date
{
    int date;
    int month;
    int year;

    void store()
    {
        cout << "Enter date\n";
        cin >> date;

        cout << "Enter month\n";
        cin >> month;

        cout << "Enter year\n";
        cin >> year;
    }

    void display()
    {
        cout << "date = " << date
             << " month = " << month
             << " year = " << year << endl;
    }
};

int main()
{
    int n;

    cout << "Enter size of array\n";
    cin >> n;

    Date d[n];   // array of structures

    // store date values
    for(int i = 0; i < n; i++)
    {
        d[i].store();
    }

    // display date values
    for(int i = 0; i < n; i++)
    {
        d[i].display();
    }

}

