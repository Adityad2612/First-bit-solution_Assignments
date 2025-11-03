class HR {
    int id;
    String name;
    double salary,commission;

    void SetId(int i) {
        this.id = i;
    }

    void SetName(String n) {
        this.name = n;
    }

    void SetSalary(double s) {
        this.salary = s;
    }

    void SetCommission(double c) {
        this.commission = c;
    }
} // class HR ends here

class HRTest {
    public static void main(String[] args) {
        HR h1 = new HR();

        h1.SetId(301);
        h1.SetName("Aditya");
        h1.SetSalary(60000);
        h1.SetCommission(5000);

        System.out.println("ID: " + h1.id + " | Name: " + h1.name +
" | Salary: " + h1.salary +" | Commission: " + h1.commission);
    } // main ends here
} // class HRTest ends here
