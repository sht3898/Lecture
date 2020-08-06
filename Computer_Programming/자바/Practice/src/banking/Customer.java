package banking;

public class Customer {
	String firstName, lastName;
	Account account;
	
	public Customer(String f, String l){
		firstName = f; lastName = l;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setAccount(Account acct){
		account = acct;
	}
	public Account getAccount(){
		return account;
	}

}
