import java.util.*;
class Account
{
	private long accountNumber;
	private String holderName;
	private double balance;
	Account()
	{
	}
	Account(long accountNumber,String holderName,double balance)
	{
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	void setAccountNumber(long accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	void setHolderName(String holderName)
	{
		this.holderName=holderName;
	}
	void setBalance(double balance)
	{
		this.balance=balance;
	}
	long getAccountNumber()
	{
		return accountNumber;
	}
	String getHolderName()
	{
		return holderName;
	}
	double getBalance()
	{
		return balance;
	}
	void printDetails()
	{
		System.out.println("Account Number = "+this.accountNumber);
		System.out.println("Account Holder Name = "+this.holderName);
		System.out.println("Account Balance = "+this.balance);
	}
}
class SavingsAccount extends Account
{
	SavingsAccount()
	{
		
	}
	SavingsAccount(long accountNumber,String holderName,double balance)
	{
		super(accountNumber,holderName,balance);
	}
	double interestRate=6.5;
	double calculateYearlyInterest()
	{
		return getBalance()*0.065;
	}
	@Override
	void printDetails()
	{
		System.out.println("-----------------------Savings Account--------------------------------------");
		super.printDetails();
		System.out.println("Yearly Interest Earned is = "+calculateYearlyInterest());
		System.out.println("----------------------------------------------------------------------------");
	}

}
class CurrentAccount extends Account
{
	CurrentAccount()
	{
		
	}
	CurrentAccount(long accountNumber,String holderName,double balance)
	{
		super(accountNumber,holderName,balance);
	}
	@Override
	void printDetails()
	{
		System.out.println("-----------------------Current Account--------------------------------------");
		super.printDetails();
		System.out.println("----------------------------------------------------------------------------");
	}
}
class Manager
{
	ArrayList<Account> list=new ArrayList<Account>();
}
class AQ2
{
	public static void main(String args[])
	{
		Manager mg=new Manager();
		mg.list.add(new SavingsAccount(123456789L,"Person0",100));
		mg.list.add(new SavingsAccount(111111111L,"Person1",200));
		mg.list.add(new CurrentAccount(222222222L,"Person2",300));
		mg.list.add(new CurrentAccount(333333333L,"Person3",400));
		mg.list.add(new CurrentAccount(444444444L,"Person4",500));
		Iterator<Account> itr = mg.list.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next()+"\t");
			itr.next().printDetails();
		}
	}
}