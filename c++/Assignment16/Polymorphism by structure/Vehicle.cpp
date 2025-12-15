#include <iostream>
#include <string>
using namespace std;

// -------------------- Vehicle --------------------
struct Vehicle
{
protected:
    int vehicleId;
    string brand;
    double price;

public:
    // default constructor
    Vehicle()
    {
        vehicleId = 1;
        brand = "Generic";
        price = 500000;
    }

    // parameterized constructor
    Vehicle(int id, string b, double p)
    {
        vehicleId = id;
        brand = b;
        price = p;
    }

    // virtual functions for polymorphism
    virtual void brake()
    {
        cout << "Brake applied!" << endl;
    }

    virtual void display()
    {
        cout << "Vehicle ID: " << vehicleId << endl;
        cout << "Brand: " << brand << endl;
        cout << "Price: " << price << endl;
    }
};

// -------------------- Car --------------------
struct Car : public Vehicle
{
protected:
    int doors;
    string fuelType;

public:
    Car() : Vehicle()
    {
        doors = 4;
        fuelType = "Petrol";
    }

    Car(int id, string b, double p, int d)
        : Vehicle(id, b, p)
    {
        doors = d;
    }

    void brake()
    {
        cout << "Drum brake applied!" << endl;
    }

    void display()
    {
        Vehicle::display();
        cout << "Doors: " << doors << endl << endl;
    }
};

// -------------------- Bike --------------------
struct Bike : public Vehicle
{
protected:
    string type;
    bool hasDiscBrake;

public:
    Bike() : Vehicle()
    {
        type = "Sport";
        hasDiscBrake = true;
    }

    Bike(int id, string b, double p, string t, bool disc)
        : Vehicle(id, b, p)
    {
        type = t;
        hasDiscBrake = disc;
    }

    void brake()
    {
        cout << "Disk brake applied!" << endl;
    }

    void display()
    {
        Vehicle::display();
        cout << "Bike Type: " << type << endl;
        cout << "Has Disc Brake: " << hasDiscBrake << endl << endl;
    }
};

// -------------------- Truck --------------------
struct Truck : public Vehicle
{
protected:
    double loadCapacity;

public:
    Truck() : Vehicle()
    {
        loadCapacity = 10.0;
    }

    Truck(int id, string b, double p, double load)
        : Vehicle(id, b, p)
    {
        loadCapacity = load;
    }

    void brake()
    {
        cout << "Air brake applied!" << endl;
    }

    void display()
    {
        Vehicle::display();
        cout << "Load Capacity (tons): " << loadCapacity << endl << endl;
    }
};

// -------------------- VehicleTest --------------------
int main()
{
    Vehicle* v1;

    v1 = new Vehicle(2, "Tata", 700000);
    v1->display();
    v1->brake();
    cout << endl;

    v1 = new Car(3, "Hyundai", 900000, 4);
    v1->display();
    v1->brake();
    cout << endl;

    v1 = new Bike(4, "Yamaha", 150000, "Cruiser", true);
    v1->display();
    v1->brake();
    cout << endl;

    v1 = new Truck(5, "Ashok Leyland", 2500000, 15.0);
    v1->display();
    v1->brake();
}

