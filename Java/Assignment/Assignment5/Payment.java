package Assignment5;

abstract class Payment
{
	int paymentId;
	double amount;
	String payerName;
	String status;   

	Payment() //default constructor
	{
		this.paymentId = 101;
		this.amount = 25000;
		this.payerName = "Rakesh";
		this.status = "PENDING";
	}

	Payment(int paymentId, double amount, String payerName) //parameterized constructor
	{
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName = payerName;
		this.status = "PENDING";
	}

	
	
	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	void printSummary()
	{
		System.out.println("\n----- PAYMENT SUMMARY -----");
		System.out.println("Payment ID: " + this.paymentId);
		System.out.println("Payer Name: " + this.payerName);
		System.out.println("Amount: " + this.amount);
		System.out.println("Status: " + this.status);
	}

	final void process()
	{
		System.out.println("\nProcessing Payment ID: " + paymentId);

		if (validate())
		{
			deductAmount();
			sendNotification();
			status = "SUCCESS";
		}
		else
		{
			System.out.println("Payment Failed");
			status = "FAILED";
		}
	}

	abstract boolean validate();
	abstract void deductAmount();
	abstract void sendNotification();
} //payment class ends here


class CardPayment extends Payment
{
	String cardNumber;
	int cvv;

	CardPayment(int paymentId, double amount, String payerName, String cardNumber, int cvv)
	{
		super(paymentId, amount, payerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
	

	public String getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}



	public int getCvv() {
		return cvv;
	}



	public void setCvv(int cvv) {
		this.cvv = cvv;
	}



	boolean validate()
	{
		System.out.println("Validating Card Payment...");

		if (cardNumber.length() != 16)
		{
			System.out.println("Invalid Card Number! Must be 16 digits.");
			return false;
		}
		if (String.valueOf(cvv).length() != 3)
		{
			System.out.println("Invalid CVV! Must be 3 digits.");
			return false;
		}
		if (amount <= 0)
		{
			System.out.println("Amount should be greater than 0.");
			return false;
		}

		return true;
	}

	void deductAmount()
	{
		System.out.println("Amount Rs." + this.amount + " deducted from card " + this.cardNumber);
	}

	void sendNotification()
	{
		System.out.println("Notification sent to " + this.payerName + " (Card Payment)");
	}
} //payment card class ends here


class UPIPayment extends Payment
{
	String upiId;

	UPIPayment(int paymentId, double amount, String payerName, String upiId)
	{
		super(paymentId, amount, payerName);
		this.upiId = upiId;
	}
	
	

	public String getUpiId() {
		return upiId;
	}



	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}



	boolean validate()
	{
		System.out.println("Validating UPI Payment...");

		if (!upiId.contains("@"))
		{
			System.out.println("Invalid UPI ID! Must contain '@'");
			return false;
		}
		if (amount < 1 || amount > 100000)
		{
			System.out.println("Amount must be between 1 and 100000.");
			return false;
		}

		return true;
	}

	void deductAmount()
	{
		System.out.println("Amount Rs." + this.amount + " deducted via UPI: " + this.upiId);
	}

	void sendNotification()
	{
		System.out.println("Notification sent to " + this.payerName + " (UPI Payment)");
	}
} //upi payment class ends here

class PaymentTest
{
	public static void main(String[] args)
	{
		Payment p1;

		p1 = new CardPayment(101, 2500, "Rohit Sharma", "1234567812345678", 123);
		p1.process();
		p1.printSummary();

		p1 = new CardPayment(102, 0, "Virat Kohli", "9876543212345678", 777); 
		p1.process();
		p1.printSummary();

		p1 = new UPIPayment(103, 950, "Hardik Pandya", "hardik@upi");
		p1.process();
		p1.printSummary();

		p1 = new UPIPayment(104, 200000, "Bumrah", "boom@oksbi"); 
		p1.process();
		p1.printSummary();
	} //main ends here
} // payment test class ends here

