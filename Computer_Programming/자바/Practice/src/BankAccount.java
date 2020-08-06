
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
		return "���¹�ȣ: "+accountNumber+" ������: "+owner+" �ܾ�: "+String.format("%,d", balance);
	}
	public boolean transfer(int amount, BankAccount otherAccount){
		if(amount<=balance){
			otherAccount.balance+=amount;
			balance-=amount;
			return true;
		}else System.out.println("�ܾ׺���");
		return false;
	}
}
