#include<iostream>
using namespace std;

struct Date
{
    int day;
    int month;
    int year;

    void store()
    {
        cout << "Enter date\n";
        cin >> day;

        cout << "Enter month\n";
        cin >> month;

        cout << "Enter year\n";
        cin >> year;
    }

    void display()
    {
        cout << "date = " << day << " month = " << month << " year = " << year << endl;
    }
};

int main()
{
    Date d1, d2;

    d1.store();
    d2.store();

    d1.display();
    d2.display();

}

