class Distance {
    int km,m;

    void SetKm(int k) {
        this.km = k;
    }

    void SetM(int meters) {
        this.m = meters;
    }
} // class Distance ends here

class DistanceTest {
    public static void main(String[] args) {
        Distance d1 = new Distance();

        d1.SetKm(5);
        d1.SetM(350);

        System.out.println("Distance: " + d1.km + " km " + d1.m + " m");
    } // main ends here
} // class DistanceTest ends here
