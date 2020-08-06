package banking;

public class Customer1 {
	private String firstName;
	private String lastName;
	Account[] accounts;
	
	public Customer1(String f, String l){
		accounts = new Account[5];
		firstName = f;
		lastName = l;
	
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void addAccount(Account sa){
		for(int i=0;i<accounts.length;i++){
			accounts[i]=sa;
		}
	}
	public Account getAccount(int index){
		return accounts[index];
	}
	public int getNumOfAccounts(){
		return accounts.length+1;
	
	}


}
