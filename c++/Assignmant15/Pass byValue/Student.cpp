#include<iostream>
using namespace std;

struct student
{
    int roll_no;
    char name[15];
    int marks;

    void store()
    {
        cout << "Enter roll number: ";
        cin >> roll_no;

        cout << "Enter name: ";
        cin >> name;

        cout << "Enter marks: ";
        cin >> marks;
    }

    void display() 
    {
        cout << "Roll number = " << roll_no << ", Name = " << name << ", Marks = " << marks << endl;
    }
};

int main()
{
    student s1;

    s1.store();     // call on object
    s1.display();   // display same object

}

