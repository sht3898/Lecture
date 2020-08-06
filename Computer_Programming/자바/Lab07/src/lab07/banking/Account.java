package lab07.banking;

public class Account {
	private double balance;
	
	public Account(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double amt){
		balance+=amt;
	}
	public boolean withdraw(double amt){
		if(amt<balance){
			balance-=amt;
			return true;
		}
		else return false;
	}
	

}
