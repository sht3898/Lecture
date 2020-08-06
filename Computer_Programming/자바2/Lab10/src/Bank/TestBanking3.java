package Bank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TestBanking3 {
	static NumberFormat currency_format = NumberFormat.getCurrencyInstance(Locale.KOREA);
	static Bank bank = new Bank();
	static Customer customer;
	static Account account;
	public static void main(String[] args) {
		initializeCustomers();
		generateReport();
		System.out.println();
		Scanner input = new Scanner(System.in);
		int month;
		System.out.print("°³¿ù¼ö: ");
		month = input.nextInt();
		
		System.out.println();
		System.out.println(month + "°³¿ù ÈÄÀÇ ÀÜ¾×");
		System.out.println();

		doAccumulateSavings(month);
		generateReport();
	}
	
	public static void initializeCustomers(){
		bank.addCustomer(new Customer("Jane","Simms"));
		customer = bank.getCustomer(0);
		customer.addAccount(new SavingsAccount(500.00,0.05));
		customer.addAccount(new CheckingAccount(200.00, new SavingsAccount(400.00, 0)));
		
		bank.addCustomer(new Customer("Owen", "Bryant"));
		customer = bank.getCustomer(1);
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer(new Customer("Tim", "Soley"));
		customer = bank.getCustomer(2);
		customer.addAccount(new SavingsAccount(1500.00,0.05));
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer(new Customer("Maria", "Soley"));
		customer = bank.getCustomer(3);
		customer.addAccount(bank.getCustomer(2).getAccount(1));
		customer.addAccount(new SavingsAccount(150.00,0.05));
	}
	
	public static void generateReport(){
		System.out.println("\t\t\t°í°´ Á¤º¸");
		System.out.println("\t\t\t===============");
		
		for( int cust_idx = 0; cust_idx < bank.getNumofCustomers(); cust_idx++ ){
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
	
	public static void doAccumulateSavings( int month ){
		for( int cust_idx = 0; cust_idx < bank.getNumofCustomers(); cust_idx++ ){
			customer = bank.getCustomer(cust_idx);
			for( int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++ ){
				account = customer.getAccount(acct_idx);
				if( account instanceof SavingsAccount ){
					account.balance = account.balance + (account.balance*((SavingsAccount) account).getInterstRate()*month); 
				}
			}
		}
	}
}
