package lab07.banking;

public class Customer {
	private String firstName;
	private String lastName;
	private String account;
	
	public Customer(String f, String l){
		this.firstName = f;
		this.lastName = l;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setAccount(Account acct){
		account = acct.toString();
	}
	public String getAccount(){
		return account;
	}

}
