package banking;

public class TestBanking {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer1 = new Customer("±æµ¿","È«");
		Customer customer2 = new Customer("ÇöÅÃ","È«");
		Customer customer3 = new Customer("Çö¼­","È«");
		Account account1 = new Account(100000);
		Account account2 = new Account(150000);
		Account account3 = new Account(8000);
		customer1.setAccount(account1);
		customer2.setAccount(account2);
		customer3.setAccount(account3);
		if(account1.getBalance()<account2.getBalance()){
			if(account2.getBalance()<account3.getBalance()){//1,2,3
				account3.withdraw(account3.getBalance()/2);
				account1.deposit(account3.getBalance());
			}else if(account3.getBalance()<account2.getBalance()){
				if(account1.getBalance()<account3.getBalance()){//1,3,2
					account2.withdraw(account2.getBalance()/2);
					account1.deposit(account2.getBalance());
				}else{											//3,1,2
					account2.withdraw(account2.getBalance()/2);
					account3.deposit(account2.getBalance());
				}
			}
		}
		else if(account2.getBalance()<account3.getBalance()){
			if(account3.getBalance()<account1.getBalance()){//2,3,1
				account1.withdraw(account1.getBalance()/2);
				account2.deposit(account1.getBalance());
			}else if(account1.getBalance()<account3.getBalance()){
				if(account2.getBalance()<account1.getBalance()){//2,1,3
					account3.withdraw(account3.getBalance()/2);
					account3.deposit(account3.getBalance());
				}
			}
		}else{//3,2,1
			account1.withdraw(account1.getBalance()/2);
			account3.deposit(account1.getBalance());
		}
	
		
		System.out.println(customer1.getLastName()+customer1.getFirstName()+" °í°´ÀÇ ÇöÀç ÀÜ¾×Àº "+(int)customer1.getAccount().getBalance()+"¿øÀÔ´Ï´Ù.");
		System.out.println(customer2.getLastName()+customer2.getFirstName()+" °í°´ÀÇ ÇöÀç ÀÜ¾×Àº "+(int)customer2.getAccount().getBalance()+"¿øÀÔ´Ï´Ù.");
		System.out.println(customer3.getLastName()+customer3.getFirstName()+" °í°´ÀÇ ÇöÀç ÀÜ¾×Àº "+(int)customer3.getAccount().getBalance()+"¿øÀÔ´Ï´Ù.");
	}

}
