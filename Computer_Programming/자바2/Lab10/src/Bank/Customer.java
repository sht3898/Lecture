package Bank;

public class Customer {
	private Account[] accounts;
	private String lastName;
	private String firstName;
	private int numofAccounts;
	public Customer(String f, String l) {
		super();
		this.firstName = f;
		this.lastName = l;
		accounts = new Account[5];
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void addAccount( Account account ){
		accounts[numofAccounts++] = account;
	}
	
	public Account getAccount( int index ){
		return accounts[index];
	}
	
	public int getNumOfAccounts(){
		return this.numofAccounts;
	}
	
}
