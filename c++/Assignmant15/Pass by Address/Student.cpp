#include<iostream>
using namespace std;

struct Student
{
    int rollno;
    char name[15];
    int marks;

    void store()
    {
        cout << "Enter roll number\n";
        cin >> rollno;

        cout << "Enter name of student\n";
        cin >> name;

        cout << "Enter marks\n";
        cin >> marks;
    }

    void display() 
    {
        cout << "Rollno = " << rollno
             << ", Name = " << name
             << ", Marks = " << marks << endl;
    }
};

int main()
{
    int n;

    cout << "Enter size of array\n";
    cin >> n;

    Student s[n];   // array of structures

    // store data
    for(int i = 0; i < n; i++)
    {
        s[i].store();
    }

    // display data
    for(int i = 0; i < n; i++)
    {
        s[i].display();
    }

}

