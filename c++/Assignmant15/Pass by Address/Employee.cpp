#include<iostream>
using namespace std;

struct Employee
{
    int id;
    char name[15];
    int salary;

    void store()
    {
        cout << "Enter id\n";
        cin >> id;

        cout << "Enter name\n";
        cin >> name;

        cout << "Enter salary\n";
        cin >> salary;
    }

    void display()
    {
        cout << "Id = " << id << ", Name = " << name << ", Salary = " << salary << endl;
    }
};

int main()
{
    int n;

    cout << "Enter size of array\n";
    cin >> n;

    Employee e[n];   // array of structures

    // store employee details
    for(int i = 0; i < n; i++)
    {
        e[i].store();
    }

    // display employee details
    for(int i = 0; i < n; i++)
    {
        e[i].display();
    }

}

