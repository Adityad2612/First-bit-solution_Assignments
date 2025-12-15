#include <iostream>
#include <string>
using namespace std;

// -------------------- PowerPlant --------------------
class PowerPlant
{
protected:
    int plantId;
    string plantName;
    string location;
    double capacity;
    int employeeCount;
    double annualProduction;

public:
    // default constructor
    PowerPlant()
    {
        plantId = 101;
        plantName = "Central Power Plant";
        location = "Maharashtra";
        capacity = 500.0;
        employeeCount = 200;
        annualProduction = 1500000.0;
    }

    // parameterized constructor
    PowerPlant(int id, string name, string loc, double cap, int emp, double prod)
    {
        plantId = id;
        plantName = name;
        location = loc;
        capacity = cap;
        employeeCount = emp;
        annualProduction = prod;
    }

    // virtual functions for polymorphism
    virtual void start()
    {
        cout << "Start!" << endl;
    }

    virtual void display()
    {
        cout << "Plant ID: " << plantId << endl;
        cout << "Plant Name: " << plantName << endl;
        cout << "Location: " << location << endl;
        cout << "Capacity (MW): " << capacity << endl;
        cout << "Employee Count: " << employeeCount << endl;
        cout << "Annual Production (MWh): " << annualProduction << endl;
    }
};

// -------------------- SolarPlant --------------------
class SolarPlant : public PowerPlant
{
protected:
    int solarPanels;
    double areaCovered;
    double sunlightHours;

public:
    SolarPlant() : PowerPlant()
    {
        solarPanels = 10000;
        areaCovered = 25.5;
        sunlightHours = 8.0;
    }

    SolarPlant(int id, string name, string loc, double cap, int emp, double prod,
               int panels, double area, double hours)
        : PowerPlant(id, name, loc, cap, emp, prod)
    {
        solarPanels = panels;
        areaCovered = area;
        sunlightHours = hours;
    }

    void start()
    {
        cout << "Start! started receiving solar energy" << endl;
    }

    void display()
    {
        PowerPlant::display();
        cout << "Number of Solar Panels: " << solarPanels << endl;
        cout << "Area Covered (acres): " << areaCovered << endl;
        cout << "Sunlight Hours per Day: " << sunlightHours << endl << endl;
    }
};

// -------------------- HydroPlant --------------------
class HydroPlant : public PowerPlant
{
protected:
    double waterFlowRate;
    double damHeight;
    int turbines;

public:
    HydroPlant() : PowerPlant()
    {
        waterFlowRate = 150.5;
        damHeight = 120.0;
        turbines = 6;
    }

    HydroPlant(int id, string name, string loc, double cap, int emp, double prod,
               double flow, double height, int turb)
        : PowerPlant(id, name, loc, cap, emp, prod)
    {
        waterFlowRate = flow;
        damHeight = height;
        turbines = turb;
    }

    void start()
    {
        cout << "Start! started water turbines" << endl;
    }

    void display()
    {
        PowerPlant::display();
        cout << "Water Flow Rate (m^3/s): " << waterFlowRate << endl;
        cout << "Dam Height (m): " << damHeight << endl;
        cout << "Number of Turbines: " << turbines << endl << endl;
    }
};

// -------------------- WindPlant --------------------
class WindPlant : public PowerPlant
{
protected:
    int windTurbines;
    double averageWindSpeed;
    double rotorDiameter;

public:
    WindPlant() : PowerPlant()
    {
        windTurbines = 50;
        averageWindSpeed = 12.5;
        rotorDiameter = 80.0;
    }

    WindPlant(int id, string name, string loc, double cap, int emp, double prod,
              int turbines, double speed, double diameter)
        : PowerPlant(id, name, loc, cap, emp, prod)
    {
        windTurbines = turbines;
        averageWindSpeed = speed;
        rotorDiameter = diameter;
    }

    void start()
    {
        cout << "Start! Started air turbines" << endl;
    }

    void display()
    {
        PowerPlant::display();
        cout << "Number of Wind Turbines: " << windTurbines << endl;
        cout << "Average Wind Speed (m/s): " << averageWindSpeed << endl;
        cout << "Rotor Diameter (m): " << rotorDiameter << endl << endl;
    }
};

// -------------------- PowerPlantTest --------------------
int main()
{
    PowerPlant* p1;

    cout << "--- Power Plant ---" << endl;
    p1 = new PowerPlant(102, "Eastern Power Plant", "Karnataka",700.0, 300, 2500000.0);
    p1->display();
    p1->start();

    cout << "\n--- Solar Power Plant ---" << endl;
    p1 = new SolarPlant(103, "Green Solar", "Rajasthan",250.0, 150, 900000.0,15000, 40.5, 9.5);
    p1->display();
    p1->start();

    cout << "\n--- Hydro Power Plant ---" << endl;
    p1 = new HydroPlant(104, "River Hydro", "Himachal",400.0, 180, 1200000.0,180.2, 130.0, 8);
    p1->display();
    p1->start();

    cout << "\n--- Wind Power Plant ---" << endl;
    p1 = new WindPlant(105, "Windy Hills", "Tamil Nadu",300.0, 160, 1000000.0,75, 14.2, 90.0);
    p1->display();
    p1->start();

}

