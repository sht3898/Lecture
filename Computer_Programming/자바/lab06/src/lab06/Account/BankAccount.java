package lab06.Account;


public class BankAccount {
	String accountNumber;
	int balance = 0;
	String owner;
	
	public void deposit( int amount ){
		balance += amount;
	}
	
	public boolean withdraw( int amount ){
		if( balance < amount ){
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}
	
	public String toString(){
		return owner + ", " + accountNumber + ", ÀÜ¾× " + String.format("%,d", balance) + "¿ø";
	}
	
	public boolean transfer( int amount, BankAccount otherAccount ){
		boolean succcess = withdraw(amount);
		if( succcess ) {
			otherAccount.deposit(amount);
		}
		return succcess;
	}
	
}
