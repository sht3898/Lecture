package Banking;

class CheckingAccount extends Account{
	
	private SavingsAccount protectedBy;
	
	public CheckingAccount(double balance){
		super(balance);
		
	}
	
	public CheckingAccount(double balance, SavingsAccount protect){
		super(balance);
		protectedBy=protect;
	}
	@Override
	public boolean withdraw(double amt){
		if(amt<=balance){
			balance-=amt;
			return true;
		}else protectedBy.balance-=amt;
			return false;

	}
}