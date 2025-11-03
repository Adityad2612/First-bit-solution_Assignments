class Admin {
    int id;
    double salary,allowances;
    String name;

    void SetId(int i) {
        this.id = i;
    }

    void SetSalary(double s) {
        this.salary = s;
    }

    void SetName(String n) {
        this.name = n;
    }

    void SetAllowances(double a) {
        this.allowances = a;
    }
} // class Admin ends here

class AdminTest {
    public static void main(String[] args) {
        Admin a1 = new Admin();

        a1.SetId(201);
        a1.SetSalary(55000);
        a1.SetName("Ravi");
        a1.SetAllowances(8000);

        System.out.println("ID: " + a1.id +" | Name: " + a1.name +
" | Salary: " + a1.salary + "| Allowances: " + a1.allowances);
    } // main ends here
} // class AdminTest ends here
