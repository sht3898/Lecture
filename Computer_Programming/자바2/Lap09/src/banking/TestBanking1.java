package banking;

public class TestBanking1 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer;
		Account account;
		
		bank.addCustomer(new Customer("����", "��"));
		customer = bank.getCustomer(0);
		customer.setSavingsAccount(new SavingsAccount(500., 0.05));
		customer.setCheckingAccount(new CheckingAccount(200.00,customer.getSavingsAccount()));
		
		
		bank.addCustomer(new Customer("����",  "��"));
		customer = bank.getCustomer(1);
		customer.setCheckingAccount(new CheckingAccount(200.0));
		
		
		bank.addCustomer(new Customer("�¿�", "��"));
		customer = bank.getCustomer(2);
		customer.setSavingsAccount(new SavingsAccount(1500.00, 0.05));
		customer.setCheckingAccount(new CheckingAccount(200.0));
		
		bank.addCustomer(new Customer("����", "��"));
		customer = bank.getCustomer(3);
		customer.setCheckingAccount(bank.getCustomer(2).getCheckingAccount());
		
		//Jane �׽�Ʈ
		customer = bank.getCustomer(0);
		account = customer.getCheckingAccount();
		System.out.println("�� [" + customer.getFirstName() + " " + customer.getLastName() + "]: ��� 150.00�޷� ���: " + (account.withdraw(150.0) ? " ����" : "����"));
		System.out.println("�� [" + customer.getFirstName() + " " + customer.getLastName() + "]: �Ա� 22.50�޷� ���: " + (account.deposit(22.5) ? "����" : "����"));
		System.out.println("�� [" + customer.getFirstName() + " " + customer.getLastName() + "]: ��� 147.62�޷� ���: " + (account.withdraw(147.62) ? "����" : "����"));
		System.out.println("�� [" + customer.getFirstName() + " " + customer.getLastName() + "]���� cheking�ܾ���  " + account.getBalance()  + "�̰�, savings�� �ܾ��� "
		+ customer.getSavingsAccount().balance + "�Դϴ�.");
		System.out.println();
		
		//Bryant �׽�Ʈ
		customer = bank.getCustomer(1);
		account = customer.getCheckingAccount();
		System.out.println("�� [" + customer.getFirstName() + " " + customer.getLastName() + "]: ��� 100.00�޷� ���: " + (account.withdraw(150.0) ? " ����" : "����"));
		System.out.println("�� [" + customer.getFirstName() + " " + customer.getLastName() + "]: �Ա� 25.00�޷� ���: " + (account.deposit(25.0) ? "����" : "����"));
		System.out.println("�� [" + customer.getFirstName() + " " + customer.getLastName() + "]: ��� 175.00�޷� ���: " + (account.withdraw(175.00) ? "����" : "����"));
		System.out.println("�� [" + customer.getFirstName() + " " + customer.getLastName() + "]���� cheking�ܾ���  " + account.getBalance()  + "�޷� �Դϴ�.");
		System.out.println();
	}
}
