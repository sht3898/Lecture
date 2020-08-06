class BankAccount{
	String accountNumber;
	String owner;
	int balance;
	public void deposit(int amount){
		balance+=amount;
	}
	boolean withdraw(int amount){
		balance-=amount;
		return false;
	}
	public String toString(int b){
		b=balance;
	}
}
public class TestBankAccount {

	public static void main(String[] args) {
		

	}

}
