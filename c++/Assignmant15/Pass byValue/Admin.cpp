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
        cout << "Enter id of admin:\n";
        cin >> id;

        cout << "Enter name of admin:\n";
        cin >> name;

        cout << "Enter salary of admin:\n";
        cin >> salary;

        cout << "Enter allowance of admin:\n";
        cin >> allowance;
    }

    void display() 
    {
        cout << "Id = " << id << " Name = " << name << " Salary = " << salary << " Allowance = " << allowance << endl;
    }
};

int main()
{
    Admin a1;

    a1.store();
    a1.display();

}

