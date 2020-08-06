package Bank;

public class SavingsAccount extends Account {
	private double interstRate;

	public SavingsAccount(double init_balance, double interstRate) {
		super(init_balance);
		this.interstRate = interstRate;
	}

	public double getInterstRate() {
		return interstRate;
	}
	public String getAcctType(){
		return "Savings";
	}
	

}
