package banking;

public class SavingsAccount extends Account {
	public SavingsAccount(double balance, double interest_Rate) {
		super(balance);
		interestRate=interest_Rate;
		
	}

	private double interestRate;
	
	public void Calbalance(int month){
		balance=balance*interestRate*month+balance;
	}
	
}
