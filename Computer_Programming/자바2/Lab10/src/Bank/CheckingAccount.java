package Bank;

public class CheckingAccount extends Account {
	private SavingsAccount protectedBySavingsAccount;
	
	public CheckingAccount(double init_balance, SavingsAccount protectedBySavingsAccount) {
		super(init_balance);
		this.protectedBySavingsAccount = protectedBySavingsAccount;
	}

	public CheckingAccount(double init_balance) {
		super(init_balance);
	}

	@Override
	public boolean widthdraw(double amt) {
		if( balance < amt ){
			if( protectedBySavingsAccount != null ){
				double savingsAccountBalance = protectedBySavingsAccount.balance;
				if( savingsAccountBalance < amt ){
					return false;
				} else {
					protectedBySavingsAccount.balance -= amt;
					return true;
				}
			} else {
				return false;
			}
		} else {
			balance -= amt;
			return true;
		}
	}
	public String getAcctType(){
		return "Checking";
	}
	
	
}
