class Complex {
    int real,imaginary;

    void SetReal(int r) {
        this.real = r;
    }

    void SetImaginary(int i) {
        this.imaginary = i;
    }
} // class Complex ends here

class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex();

        c1.SetReal(5);
        c1.SetImaginary(3);

        System.out.println(c1.real +"+" + c1.imaginary+"i");
    } // main ends here
} // class ComplexTest ends here
