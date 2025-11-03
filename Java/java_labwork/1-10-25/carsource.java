class Car {
    String brand,model,color;
    double price,fuelCapacity;

    void SetBrand(String b) {
        this.brand = b;
    }

    void SetModel(String m) {
        this.model = m;
    }

    void SetPrice(double p) {
        this.price = p;
    }

    void SetColor(String c) {
        this.color = c;
    }

    void SetFuelCapacity(double f) {
        this.fuelCapacity = f;
    }
} // class Car ends here

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.SetBrand("Toyota");
        c1.SetModel("Camry");
        c1.SetPrice(3200000);
        c1.SetColor("White");
        c1.SetFuelCapacity(55);

        System.out.println("Brand: " + c1.brand +"Model: " + c1.model +
"Price: " + c1.price +"Color: " + c1.color +"Fuel Capacity: " + c1.fuelCapacity + 
"liters");
    } // main ends here
} // class CarTest ends here
