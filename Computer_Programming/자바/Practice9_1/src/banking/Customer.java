package banking;

public class Customer{
	private String firstName;
	private String lastName;
	SavingsAccount SavingsAccount;
	CheckingAccount CheckingAccount;
	
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
		SavingsAccount=sa;
	}
	public void setCheckingAccount(CheckingAccount ca){
		 CheckingAccount=ca;
	}
	
	public Account getSavingsAccount(){
		return SavingsAccount;
	}
	public Account getCheckingAccount(){
		return CheckingAccount;
	
	}

	
}

	

