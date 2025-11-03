class Student {
    int rollNo;
    String name;
    double marks;

    void SetRollNo(int r) {
        this.rollNo = r;
    }

    void SetName(String n) {
        this.name = n;
    }

    void SetMarks(double m) {
        this.marks = m;
    }
} // class Student ends here

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.SetRollNo(101);
        s1.SetName("Rahul");
        s1.SetMarks(88.5);

        System.out.println("Roll No: " + s1.rollNo +" | Name: " + s1.name +
" | Marks: " + s1.marks);
    } // main ends here
} // class StudentTest ends here
