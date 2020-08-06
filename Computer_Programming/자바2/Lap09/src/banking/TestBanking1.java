package banking;

public class TestBanking1 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer;
		Account account;
		
		bank.addCustomer(new Customer("제우", "박"));
		customer = bank.getCustomer(0);
		customer.setSavingsAccount(new SavingsAccount(500., 0.05));
		customer.setCheckingAccount(new CheckingAccount(200.00,customer.getSavingsAccount()));
		
		
		bank.addCustomer(new Customer("예나",  "이"));
		customer = bank.getCustomer(1);
		customer.setCheckingAccount(new CheckingAccount(200.0));
		
		
		bank.addCustomer(new Customer("승완", "강"));
		customer = bank.getCustomer(2);
		customer.setSavingsAccount(new SavingsAccount(1500.00, 0.05));
		customer.setCheckingAccount(new CheckingAccount(200.0));
		
		bank.addCustomer(new Customer("서현", "윤"));
		customer = bank.getCustomer(3);
		customer.setCheckingAccount(bank.getCustomer(2).getCheckingAccount());
		
		//Jane 테스트
		customer = bank.getCustomer(0);
		account = customer.getCheckingAccount();
		System.out.println("고객 [" + customer.getFirstName() + " " + customer.getLastName() + "]: 출금 150.00달러 결과: " + (account.withdraw(150.0) ? " 성공" : "실패"));
		System.out.println("고객 [" + customer.getFirstName() + " " + customer.getLastName() + "]: 입금 22.50달러 결과: " + (account.deposit(22.5) ? "성공" : "실패"));
		System.out.println("고객 [" + customer.getFirstName() + " " + customer.getLastName() + "]: 출금 147.62달러 결과: " + (account.withdraw(147.62) ? "성공" : "실패"));
		System.out.println("고객 [" + customer.getFirstName() + " " + customer.getLastName() + "]님의 cheking잔액은  " + account.getBalance()  + "이고, savings의 잔액은 "
		+ customer.getSavingsAccount().balance + "입니다.");
		System.out.println();
		
		//Bryant 테스트
		customer = bank.getCustomer(1);
		account = customer.getCheckingAccount();
		System.out.println("고객 [" + customer.getFirstName() + " " + customer.getLastName() + "]: 출금 100.00달러 결과: " + (account.withdraw(150.0) ? " 성공" : "실패"));
		System.out.println("고객 [" + customer.getFirstName() + " " + customer.getLastName() + "]: 입금 25.00달러 결과: " + (account.deposit(25.0) ? "성공" : "실패"));
		System.out.println("고객 [" + customer.getFirstName() + " " + customer.getLastName() + "]: 출금 175.00달러 결과: " + (account.withdraw(175.00) ? "성공" : "실패"));
		System.out.println("고객 [" + customer.getFirstName() + " " + customer.getLastName() + "]님의 cheking잔액은  " + account.getBalance()  + "달러 입니다.");
		System.out.println();
	}
}
