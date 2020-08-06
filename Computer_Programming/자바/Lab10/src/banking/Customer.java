package banking;

public class Customer {
	SavingsAccount savingsAccount;
	CheckingAccount checkingAccount;
	double account;
	private String firstName;
	private String lastName;
	
	public Customer(String f, String l){
		firstName = f;
		lastName = l;
	
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public Account getAccount(){
		double x = account;
		return new Account(x);
	}
	public void setAccount(Account acct){
		account =acct.getBalance();
	
	}
	public void setSavingsAccount(SavingsAccount sa){
		savingsAccount = sa;
	}
	public void setCheckingAccount(CheckingAccount ca){
		checkingAccount = ca;
	}
	public SavingsAccount getSavingsAccount(){
		return savingsAccount;
	}
	public CheckingAccount getcheckingAccount(){
		return checkingAccount;
	}
	
}
