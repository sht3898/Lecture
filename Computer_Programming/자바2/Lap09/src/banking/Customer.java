package banking;

public class Customer {
	private String firstName;
	private String lastName;
	private SavingsAccount savingsAccount;
	private CheckingAccount checkingAccount;
	
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
	public void setSavingsAccount(SavingsAccount sa){
		savingsAccount = sa;
	}
	public void setCheckingAccount(CheckingAccount ca){
		checkingAccount = ca;
	}
	public SavingsAccount getSavingsAccount(){
		return savingsAccount;
	}
	public CheckingAccount getCheckingAccount(){
		return checkingAccount;
	}
	
}
