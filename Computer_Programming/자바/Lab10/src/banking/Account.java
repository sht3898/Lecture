package banking;

public class Account {
	double balance;
	
	public Account(double amt){
		balance = amt;
	}
	public double getBalance(){
		return balance;
	}
	public boolean deposit(double amount){
		balance+=amount;
		return true;
	}
	public boolean withdraw(double amount){
		if (balance >= amount){
			balance-=amount;
			return true;
		}
		else
			return false;
		}
}
