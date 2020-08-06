package Bank;

public abstract class Account {
	protected double balance;
	public abstract String getAcctType();
	
	public Account(double init_balance) {
		super();
		balance = init_balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public boolean deposit( double amt ){
		if( amt < 0 ){
			return false;
		} else {
			balance += amt;
			return true;
		}
	}
	
	public boolean widthdraw( double amt ){
		if( amt > balance ) {
			return false;
		} else {
			balance -= amt;
			return true;
		}
	}
}
