package banking2;

public class Customer {
	private String firstName;
	private String lastName;
	private Account[] accounts;
	private int numofAccounts=0;
	
	public Customer(String f, String l){
		super();
		firstName = f;
		lastName = l;
		accounts = new Account[5];
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void addAccount(Account account){
		accounts[numofAccounts++]=account;
	}
	public Account getAccount(int index){
		return accounts[index];
	}
	public int getNumOfAccounts(){
		return numofAccounts;
	}
	
	
}
