package banking2;

import java.text.NumberFormat;
import java.util.Locale;

public class TestBanking2 {
	public static void main(String[] args) {
		NumberFormat currency_format = NumberFormat.getCurrencyInstance(Locale.KOREA);
		Bank bank = new Bank();
		Customer customer;
		Account account;
		
		bank.addCustomer(new Customer("Á¦¿ì", "¹Ú"));
		customer = bank.getCustomer(0);
		customer.addAccount(new SavingsAccount(500.00,0.05));
		customer.addAccount(new CheckingAccount(200.00, new SavingsAccount(400.00, 0)));
		
		bank.addCustomer(new Customer("¿¹³ª",  "ÀÌ"));
		customer = bank.getCustomer(1);
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer(new Customer("½Â¿Ï", "°­"));
		customer = bank.getCustomer(2);
		customer.addAccount(new SavingsAccount(1500.00,0.05));
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer(new Customer("¼­Çö", "À±"));
		customer = bank.getCustomer(3);
		customer.addAccount(bank.getCustomer(2).getAccount(1));
		customer.addAccount(new SavingsAccount(150.00,0.05));
		
		System.out.println("\t\t\t°í°´ Á¤º¸");
		System.out.println("\t\t\t===============");
		
		for( int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++ ){
			customer = bank.getCustomer(cust_idx);
			
			System.out.println();
			System.out.println("°í°´ [" + customer.getLastName() + " " + customer.getFirstName() + "]");
			for( int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++ ){
				account = customer.getAccount(acct_idx);
				String account_type = "";
				
				if( account instanceof SavingsAccount ) account_type = "Savings";
				if( account instanceof CheckingAccount ) account_type = "Checking";
				
				System.out.println(account_type + "°èÁÂÀÇ ÇöÀç ÀÜ¾×Àº:  " + currency_format.format(account.balance));
			}
			
		}
	}
}
