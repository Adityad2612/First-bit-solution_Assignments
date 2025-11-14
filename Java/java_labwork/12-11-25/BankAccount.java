package lab;

import java.time.LocalDate;
import java.time.Period;

class BankAccount {
    String accountHolderName;
    int accountNumber;
    double balance;
    String branchName;
    LocalDate dateOpened;
    String accountType;
    boolean isActive;
    double minimumBalance;
    String currency;

    BankAccount() {
        this.accountHolderName = "Not Given";
        this.accountNumber = 100;
        this.balance = 5000;
        this.branchName = "Not Given";
        this.dateOpened = LocalDate.now();
        this.accountType = "Not Given";
        this.isActive = false;
        this.minimumBalance = 2000;
        this.currency = "INR";
    }

    BankAccount(String accountHolderName, int accountNumber, double balance, String branchName, LocalDate dateOpened,
                String accountType, boolean isActive, double minimumBalance, String currency) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branchName = branchName;
        this.dateOpened = dateOpened;
        this.accountType = accountType;
        this.isActive = isActive;
        this.minimumBalance = minimumBalance;
        this.currency = currency;
    }

    String getAccountHolderName() { 
    	return accountHolderName; 
    }
    void setAccountHolderName(String accountHolderName) { 
    	this.accountHolderName = accountHolderName; 
    }

    int getAccountNumber() { 
    	return accountNumber; 
    }
    void setAccountNumber(int accountNumber) { 
    	this.accountNumber = accountNumber; 
    }

    double getBalance() { 
    	return balance; 
    }
    void setBalance(double balance) { 
    	this.balance = balance; 
    }

    String getBranchName() { 
    	return branchName; 
    }
    void setBranchName(String branchName) { 
    	this.branchName = branchName;
    }

    LocalDate getDateOpened() { 
    	return dateOpened;
    }
    void setDateOpened(LocalDate dateOpened) { 
    	this.dateOpened = dateOpened; 
    }

    String getAccountType() { 
    	return accountType; 
    }
    void setAccountType(String accountType) { 
    	this.accountType = accountType; 
    }

    boolean isActive() { 
    	return isActive; 
    }
    void setActive(boolean isActive) { 
    	this.isActive = isActive; 
    }

    double getMinimumBalance() { 
    	return minimumBalance; 
    }
    void setMinimumBalance(double minimumBalance) { 
    	this.minimumBalance = minimumBalance; 
    }

    String getCurrency() { 
    	return currency; 
    }
    void setCurrency(String currency) { 
    	this.currency = currency; 
    }
    
    void withdraw()
    {
    	System.out.println("Balance is:"+getBalance());
    }

    void display() {
        System.out.println("\n--- Bank Account Details ---");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Branch Name: " + branchName);
        System.out.println("Date Opened: " + dateOpened);
        System.out.println("Account Type: " + accountType);
        System.out.println("Is Active: " + isActive);
        System.out.println("Minimum Balance: " + minimumBalance);
        System.out.println("Currency: " + currency);
    }
}
// class BankAccount ends here

class SavingsAccount extends BankAccount {
    double interestRate;
    int withdrawalsThisMonth;
    boolean hasDebitCard;
    boolean hasNetBanking;
    boolean isSalaryAccount;

    SavingsAccount() {
        super();
        this.interestRate = 0.0;
        this.withdrawalsThisMonth = 0;
        this.hasDebitCard = false;
        this.hasNetBanking = false;
        this.isSalaryAccount = false;
    }

    SavingsAccount(String accountHolderName, int accountNumber, double balance, String branchName, LocalDate dateOpened,
                   String accountType, boolean isActive, double minimumBalance, String currency,
                   double interestRate, int withdrawalsThisMonth, boolean hasDebitCard, boolean hasNetBanking, boolean isSalaryAccount) {
        super(accountHolderName, accountNumber, balance, branchName, dateOpened, accountType, isActive, minimumBalance, currency);
        this.interestRate = interestRate;
        this.withdrawalsThisMonth = withdrawalsThisMonth;
        this.hasDebitCard = hasDebitCard;
        this.hasNetBanking = hasNetBanking;
        this.isSalaryAccount = isSalaryAccount;
    }

    double getInterestRate() { 
    	return interestRate; 
    }
    void setInterestRate(double interestRate) { 
    	this.interestRate = interestRate; 
    }

    int getWithdrawalsThisMonth() { 
    	return withdrawalsThisMonth; 
    }
    void setWithdrawalsThisMonth(int withdrawalsThisMonth) { 
    	this.withdrawalsThisMonth = withdrawalsThisMonth; 
    }

    boolean isHasDebitCard() { 
    	return hasDebitCard; 
    }
    void setHasDebitCard(boolean hasDebitCard) { 
    	this.hasDebitCard = hasDebitCard; 
    }

    boolean isHasNetBanking() { 
    	return hasNetBanking; 
    }
    void setHasNetBanking(boolean hasNetBanking) { 
    	this.hasNetBanking = hasNetBanking; 
    }

    boolean isSalaryAccount() { 
    	return isSalaryAccount; 
    }
    void setSalaryAccount(boolean salaryAccount) { 
    	isSalaryAccount = salaryAccount; 
    }
    
    void withdraw()
    {
    	if( getMinimumBalance()>= getBalance())
    	{
    		System.out.println("Withdraw your amount");
    	}
    	else
    	{
    		System.out.println("You do not have minimum balance!");
    	}
    }

    void display() {
        super.display();
        System.out.println("\n--- Savings Account Specific Details ---");
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Withdrawals This Month: " + withdrawalsThisMonth);
        System.out.println("Has Debit Card: " + hasDebitCard);
        System.out.println("Has Net Banking: " + hasNetBanking);
        System.out.println("Is Salary Account: " + isSalaryAccount);
    }
}
// class SavingsAccount ends here

class CurrentAccount extends BankAccount {
    double overdraftLimit;
    String businessType;
    boolean hasChequeBook;
    boolean isPremium;
    int chequeBooksIssued;

    CurrentAccount() {
        super();
        this.overdraftLimit = 100000;
        this.businessType = "VD Finserv";
        this.hasChequeBook = false;
        this.isPremium = false;
        this.chequeBooksIssued = 1;
    }

    CurrentAccount(String accountHolderName, int accountNumber, double balance, String branchName, LocalDate dateOpened,
                   String accountType, boolean isActive, double minimumBalance, String currency,
                   double overdraftLimit, String businessType, boolean hasChequeBook, boolean isPremium, int chequeBooksIssued) {
        super(accountHolderName, accountNumber, balance, branchName, dateOpened, accountType, isActive, minimumBalance, currency);
        this.overdraftLimit = overdraftLimit;
        this.businessType = businessType;
        this.hasChequeBook = hasChequeBook;
        this.isPremium = isPremium;
        this.chequeBooksIssued = chequeBooksIssued;
    }

    double getOverdraftLimit() { 
    	return overdraftLimit; 
    }
    void setOverdraftLimit(double overdraftLimit) { 
    	this.overdraftLimit = overdraftLimit; 
    }

    String getBusinessType() { 
    	return businessType; 
    }
    void setBusinessType(String businessType) { 
    	this.businessType = businessType; 
    }

    boolean isHasChequeBook() { 
    	return hasChequeBook; 
    }
    void setHasChequeBook(boolean hasChequeBook) {
    	this.hasChequeBook = hasChequeBook;
    }

    boolean isPremium() { 
    	return isPremium; 
    }
    void setPremium(boolean premium) { 
    	isPremium = premium; 
    }

    int getChequeBooksIssued() { 
    	return chequeBooksIssued; 
    }
    void setChequeBooksIssued(int chequeBooksIssued) { 
    	this.chequeBooksIssued = chequeBooksIssued; 
    }
    
    void withdraw()
    {
    	if( getOverdraftLimit()>= getBalance())
    	{
    		System.out.println("Withdraw your amount");
    	}
    	else
    	{
    		System.out.println("You have exceded overdraft limit!");
    	}
    }

    void display() {
        super.display();
        System.out.println("\n--- Current Account Specific Details ---");
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Business Type: " + businessType);
        System.out.println("Has Cheque Book: " + hasChequeBook);
        System.out.println("Is Premium: " + isPremium);
        System.out.println("Cheque Books Issued: " + chequeBooksIssued);
    }
}
// class CurrentAccount ends here

class SalaryAccount extends SavingsAccount 
{
    String employerName;
    double monthlySalaryCredit;
    LocalDate lastSalaryDate;
    LocalDate todaysalaryDate;
    boolean zeroBalanceFeature;
    boolean taxSavingEnabled;

    
   SalaryAccount() 
    {               // Default Constructor
        super();
        this.employerName = "Not Given";
        this.monthlySalaryCredit = 15000;
        this.lastSalaryDate = LocalDate.now();
        this.todaysalaryDate = LocalDate.now();
        this.zeroBalanceFeature = true; 
        this.taxSavingEnabled = false;
    }

    // Parameterized Constructor
    SalaryAccount(String accountHolderName, int accountNumber, double balance, String branchName, LocalDate dateOpened,
                  String accountType, boolean isActive, double minimumBalance, String currency,
                  double interestRate, int withdrawalsThisMonth, boolean hasDebitCard, boolean hasNetBanking, boolean isSalaryAccount,
                  String employerName, double monthlySalaryCredit, LocalDate lastSalaryDate,LocalDate todaysalaryDate,
                  boolean zeroBalanceFeature, boolean taxSavingEnabled) 
    {

        super(accountHolderName, accountNumber, balance, branchName, dateOpened, accountType,
              isActive, minimumBalance, currency, interestRate, withdrawalsThisMonth,
              hasDebitCard, hasNetBanking, isSalaryAccount);

        this.employerName = employerName;
        this.monthlySalaryCredit = monthlySalaryCredit;
        this.lastSalaryDate = lastSalaryDate;
        this.todaysalaryDate = todaysalaryDate;

        this.zeroBalanceFeature = zeroBalanceFeature;
        this.taxSavingEnabled = taxSavingEnabled;
    }

    // Getters and Setters

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public double getMonthlySalaryCredit() {
		return monthlySalaryCredit;
	}

	public void setMonthlySalaryCredit(double monthlySalaryCredit) {
		this.monthlySalaryCredit = monthlySalaryCredit;
	}

	public LocalDate getLastSalaryDate() {
		return lastSalaryDate;
	}

	public void setLastSalaryDate(LocalDate lastSalaryDate) {
		this.lastSalaryDate = lastSalaryDate;
	}

	public LocalDate getTodaysalaryDate() {
		return todaysalaryDate;
	}

	public void setTodaysalaryDate(LocalDate todaysalaryDate) {
		this.todaysalaryDate = todaysalaryDate;
	}

	public boolean isZeroBalanceFeature() {
		return zeroBalanceFeature;
	}

	public void setZeroBalanceFeature(boolean zeroBalanceFeature) {
		this.zeroBalanceFeature = zeroBalanceFeature;
	}

	public boolean isTaxSavingEnabled() {
		return taxSavingEnabled;
	}

	public void setTaxSavingEnabled(boolean taxSavingEnabled) {
		this.taxSavingEnabled = taxSavingEnabled;
	}
	
	void withdraw()
    {
		Period diff = Period.between(getLastSalaryDate(), getTodaysalaryDate());

		if (diff.getMonths() > 2 || diff.getYears() > 0) {
	        System.out.println("You can withdraw your amount");
	    } else {
	        System.out.println("You cannot withdraw — less than 2 months since last salary!");
	    }
    }
	
	void display() {
	    super.display();
	    System.out.println("\n--- Salary Account ---");
	    System.out.println("Employer Name: " + employerName);
	    System.out.println("Monthly Salary Credit: " + monthlySalaryCredit);
	    System.out.println("Last Salary Date: " + lastSalaryDate);
	    System.out.println("Today Salary Date: " + todaysalaryDate);
	    System.out.println("Zero Balance Feature: " + zeroBalanceFeature);
	    System.out.println("Tax Saving Enabled: " + taxSavingEnabled);
	}


} // Salary account ends here

class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b1;

        b1 = new BankAccount("John Doe", 101, 50000, "Mumbai",
                LocalDate.of(2020, 1, 15), "General", true, 1000, "INR");
        b1.display();
        b1.withdraw();

        b1 = new SavingsAccount("Riya Sharma", 102, 70000, "Delhi",
                LocalDate.of(2021, 5, 10), "Savings", true, 5000, "INR",
                4.5, 2, true, true, true);
        b1.display();
        b1.withdraw();

        b1 = new CurrentAccount("Neha Verma", 103, 150000, "Bangalore",
                LocalDate.of(2019, 3, 5), "Current", true, 10000, "INR",
                50000, "Retail", true, true, 3);
        b1.display();
        b1.withdraw();

        b1 = new SalaryAccount("John Doe", 101, 50000, "Mumbai",
                LocalDate.of(2020, 1, 15), "Salary", true, 1000, "INR",
                0.0, 0, false, false, true,
                "Aditya", 20000,
                LocalDate.of(2025, 9, 25),
                LocalDate.of(2025, 11, 26),
                false, false);
        b1.display();
        b1.withdraw();
        
    } //main ends here
} //TestBankAccount ends here
