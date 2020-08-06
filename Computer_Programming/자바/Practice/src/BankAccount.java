
public class BankAccount {
	String accountNumber;
	String owner;
	int balance;
	public void deposit(int amount){
		balance+=amount;
	}
	public boolean withdraw(int amount){
		if(amount<=balance){
			balance-=amount;
			return true;
		}
		else return false;
	}
	public String toString(){
		return "°èÁÂ¹øÈ£: "+accountNumber+" ¿¹±ÝÁÖ: "+owner+" ÀÜ¾×: "+String.format("%,d", balance);
	}
	public boolean transfer(int amount, BankAccount otherAccount){
		if(amount<=balance){
			otherAccount.balance+=amount;
			balance-=amount;
			return true;
		}else System.out.println("ÀÜ¾×ºÎÁ·");
		return false;
	}
}
