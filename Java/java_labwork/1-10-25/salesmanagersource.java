class SalesManager {
    int id;
    String name;
    double salary,incentive,target;

    void SetId(int i) {
        this.id = i;
    }

    void SetName(String n) {
        this.name = n;
    }

    void SetSalary(double s) {
        this.salary = s;
    }

    void SetIncentive(double inc) {
        this.incentive = inc;
    }

    void SetTarget(double t) {
        this.target = t;
    }
} // class SalesManager ends here

class SalesManagerTest {
    public static void main(String[] args) {
        SalesManager sm1 = new SalesManager();

        sm1.SetId(401);
        sm1.SetName("Amit");
        sm1.SetSalary(70000);
        sm1.SetIncentive(10000);
        sm1.SetTarget(500000);

        System.out.println("ID: " + sm1.id +" | Name: " + sm1.name +" | Salary: "
 + sm1.salary + " | Incentive: " + sm1.incentive +" | Target: " + sm1.target);
    } // main ends here
} // class SalesManagerTest ends here
