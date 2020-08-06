package banking;

public class TestBanking {

	public static void main(String[] args) {
		Customer customer1 = new Customer("길동","홍");
		Account hongAccount = new Account(100000);
		customer1.setAccount(hongAccount);
		customer1.getAccount().withdraw(80000);
		customer1.getAccount().deposit(30000);
		customer1.getAccount().withdraw(200000);
		System.out.println("현재 잔액은 "+(int)customer1.getAccount().getBalance()+"원입니다.");
		
	}

}
