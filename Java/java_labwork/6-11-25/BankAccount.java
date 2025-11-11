import java.util.Scanner;

class BankAccount
{
	int accNumber;
	String accHolderName;
	double currentBalance;
	static double interestRate;

	static
	{
		interestRate=7;
	}

	BankAccount() //default constructor
	{
		this.accNumber=457812;
		this.accHolderName = "Sham";
		this.currentBalance = 2500;
	}

	BankAccount(int i,String str1,double d)
	{
		System.out.println();
		this.accNumber=i;
		this.accHolderName=str1;
		this.currentBalance=d;
	}

	void setAcc(int ac) 
	{
        	this.accNumber = ac;
    	}

	void setAccHolderName(String str) 
	{
        	this.accHolderName = str;
    	}

	void setCurrentBalance(double cb) 
	{
        	this.currentBalance = cb;
    	}

	void setInetrestRate(double ir) 
	{
        	interestRate = ir;
    	}

	int getAcc()
	{
		return this.accNumber;
	}

	String getAccHolderName()
	{
		return this.accHolderName;
	}

	double getCurrentBalance()
	{
		return this.currentBalance;
	}

	double getInetrestRate()
	{
		return this.interestRate;
	}

	void display()
	{
		System.out.println("Account Number is:"+this.accNumber);
		System.out.println("Account Holder name is:"+this.accHolderName);
		System.out.println("Current Balance is:"+this.currentBalance);
		System.out.println("Interest Rate is:"+this.interestRate);
		System.out.println();
	}

} // BankAccount class ends here

class BankAccountTest
{
	public static void main(String[] args)
	{
	BankAccount ba1 = new BankAccount();
	BankAccount ba2 = new BankAccount();
	BankAccount ba3 = new BankAccount();
	BankAccount ba4 = new BankAccount(1475821,"Krish",1500);
	Scanner sc = new Scanner(System.in);

	/*ba1.setAcc(4510238);
	ba1.setAccHolderName("Aditya");
	ba1.setCurrentBalance(5500);
	BankAccount.setInetrestRate(7);*/

	ba2.setAcc(23578965);
	ba2.setAccHolderName("Ram");
	ba2.setCurrentBalance(10000);
	BankAccount.setInetrestRate(7);

	/*ba1.getAcc();
        ba1.getAccHolderName();
        ba1.getCurrentBalance();
        ba1.getInetrestRate();

	ba2.getAcc();
        ba2.getAccHolderName();
        ba2.getCurrentBalance();
        ba2.getInetrestRate();

	if(ba1.getCurrentBalance() > ba2.getCurrentBalance())
	{
		System.out.println("ba1 has more money");
	}else
		System.out.println("ba2 has more money");

		ba1.display();
		ba2.display();
		ba3.display();
		ba4.display();

	System.out.println("Account number " + ba1.accNumber +"Account holder name: " + ba1.accHolderName +"Current balance: " + ba1.currentBalance +
				"Interest rate: " + ba1.interestRate);
	
		System.out.println("Enter acc number:");
		int acc = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter acc holder name:");
		String name = sc.nextLine();
		
		System.out.println("Enter current balance:");
		double balance = sc.nextDouble();

		System.out.println("Enter Interset Rate:");
		double ir = sc.nextDouble();

		BankAccount ba5 = new BankAccount(acc, name, balance, ir);
		ba5.display();*/

		BankAccount ba6 = new BankAccount(1475821,"Krish",1500);
		BankAccount ba7 = new BankAccount(1475,"Radha",1500);
		BankAccount ba8 = new BankAccount(14,"Jashu",1500);

		ba6.display();
		ba7.display();
		ba8.display();
		
	
	} //main ends here
} //BankAccountTest ends here
       
