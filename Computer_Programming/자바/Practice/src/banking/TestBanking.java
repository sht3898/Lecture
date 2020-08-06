package banking;

public class TestBanking {

	public static void main(String[] args) {
		Customer h = new Customer("ȫ","�浿");
		Account hong = new Account(100000);
		hong.withdraw(80000);
		hong.deposit(30000);
		hong.withdraw(200000);
		System.out.print(h.getAccount());
		System.out.print(hong.getBalance());
	}

}
