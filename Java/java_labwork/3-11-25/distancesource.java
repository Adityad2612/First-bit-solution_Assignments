class Distance {
    int km,m;

    void setKm(int k) {
        this.km = k;
    }

    void setM(int meters) {
        this.m = meters;
    }

	int getKm()
	{
		return this.km;
	}
	int getM()
	{
		return this.m;
	}

	void display()
	{
		System.out.println("Distance is "+this.km+"km"+this.m+"m");
	}
} // class Distance ends here

class DistanceTest {
    public static void main(String[] args) {
        Distance d1 = new Distance();
	Distance d2 = new Distance();

        d1.setKm(5);
        d1.setM(350);

	d2.setKm(7);
        d2.setM(540);

	d1.getKm();
        d1.getM();

	d2.getKm();
        d2.getM();

	if(d1.getKm() > d2.getKm()){
		System.out.println("d1 is greater");
	}else
		System.out.println("d2 is greater");

	d1.display();
	d2.display();

        System.out.println("Distance: " + d1.km + " km " + d1.m + " m");
    } // main ends here
} // class DistanceTest ends here
