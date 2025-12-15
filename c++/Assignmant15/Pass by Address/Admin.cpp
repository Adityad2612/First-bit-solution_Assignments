#include<iostream>
using namespace std;

struct Admin
{
    int id;
    char name[15];
    int salary;
    int allowance;

    void store()
    {
        cout << "Enter id\n";
        cin >> id;

        cout << "Enter name\n";
        cin >> name;

        cout << "Enter salary\n";
        cin >> salary;

        cout << "Enter allowance\n";
        cin >> allowance;
    }

    void display()
    {
        cout << "id = " << id << " and name = " << name << " and salary = " << salary << " and allowance = " << allowance << endl;
    }
};

int main()
{
    int n;

    cout << "Enter size of array\n";
    cin >> n;

    Admin a[n];   // array of structures

    // store admin data
    for(int i = 0; i < n; i++)
    {
        a[i].store();
    }

    // display admin data
    for(int i = 0; i < n; i++)
    {
        a[i].display();
    }

}

