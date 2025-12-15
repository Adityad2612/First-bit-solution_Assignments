#include<iostream>
using namespace std;

struct Product
{
    int id;
    char name[15];
    int quantity;
    int price;

    void store()
    {
        cout << "Enter id\n";
        cin >> id;

        cout << "Enter name\n";
        cin >> name;

        cout << "Enter quantity\n";
        cin >> quantity;

        cout << "Enter price\n";
        cin >> price;
    }

    void display() 
    {
        cout << "Id = " << id << ", Name = " << name << ", Quantity = " << quantity << ", Price = " << price << endl;
    }
};

int main()
{
    int n;

    cout << "Enter size of array\n";
    cin >> n;

    Product p[n];   // array of structures

    // store product details
    for(int i = 0; i < n; i++)
    {
        p[i].store();
    }

    // display product details
    for(int i = 0; i < n; i++)
    {
        p[i].display();
    }

}

