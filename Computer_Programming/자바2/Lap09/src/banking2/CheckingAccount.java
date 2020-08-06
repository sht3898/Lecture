package banking2;

public class CheckingAccount extends Account{
	private SavingsAccount protectedBy;
	
	public CheckingAccount(double balance){
		super(balance);
	}
	public CheckingAccount(double balance, SavingsAccount protect){
		super(balance);
		protectedBy = protect;
	}
	@Override
	public boolean withdraw(double amt){
		if(this.balance<amt){
			protectedBy.balance-=amt;
			return true;
		}else
		return false;
	}
	
}
