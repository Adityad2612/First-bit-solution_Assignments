#include<iostream>
using namespace std;

struct Employee
{
    int id;
    char name[15];
    int salary;

    void store()
    {
        cout << "Enter id of employee:\n";
        cin >> id;

        cout << "Enter name of employee:\n";
        cin >> name;

        cout << "Enter salary of employee:\n";
        cin >> salary;
    }

    void display() const
    {
        cout << "Id = " << id << " Name = " << name << " Salary = " << salary << endl;
    }
};

int main()
{
    Employee e1;

    e1.store();

    e1.display();

}

