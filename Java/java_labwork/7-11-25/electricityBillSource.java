class electricityBill
{
	static double RatePerUnit;
	int customerId;
	double unitsConsumed;

	static
	{
		RatePerUnit=5.0;
	}

	electricityBill(int id, double units)
	{
		this.customerId=id;
		this.unitsConsumed=units;
	}

	void setCustomerId(int ci)
	{
		this.customerId=ci;
	}
	void setUnitsConsumed(double uc)
	
	{
		this.unitsConsumed=uc;
	}
	static void setRatePerUnit(double rpu){
		RatePerUnit=rpu;
	}

	int getCustomerId()
	{
		return this.customerId;
	}
	double getUnitsConsumed()
	{
		return this.unitsConsumed;
	}
	double getRatePerUnit()
	{
		return RatePerUnit;
	}

	void calculateBill() 
	{
        	double totalBill = unitsConsumed * RatePerUnit;
        	System.out.println("Customer ID: " + customerId);
        	//System.out.println("Customer Name: " + customerName);
        	System.out.println("Units Consumed: " + unitsConsumed);
        	System.out.println("Rate per Unit: " + RatePerUnit);
        	System.out.println("Total Bill: Rs" + totalBill);
        	System.out.println();
    }

	
} // class electricitybill ends here

class Test
{
	public static void main(String[] args)
	{
		electricityBill eb1 = new electricityBill(1,100);
		electricityBill eb2 = new electricityBill(2,80);

		eb1.setRatePerUnit(7.7);


		eb1.calculateBill();
		eb2.calculateBill();

		electricityBill.setRatePerUnit(8.0);
        	System.out.println("After rate change:\n");

		eb1.calculateBill();
		eb2.calculateBill();


	} // mains ended here
} // class Test ends here