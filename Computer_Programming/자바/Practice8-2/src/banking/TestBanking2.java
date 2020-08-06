package banking;

public class TestBanking2 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer1 = new Customer("현택","서");
		Customer customer2 = new Customer("상범","서");
		Customer customer3 = new Customer("현서","서");
		bank.addCustomer(customer1);
		bank.addCustomer(customer2);
		bank.addCustomer(customer3);
		
		Account hong1Account = new  Account(100000*Math.random()); // Account 객체 생성, 초기 잔액을 100,000원으로 설정
		Account hong2Account = new  Account(100000*Math.random());
		Account hong3Account = new  Account(100000*Math.random());
		
		customer1.setAccount(hong1Account);
		customer2.setAccount(hong2Account);
		customer3.setAccount(hong3Account);
		if(customer1.getAccount().getBalance()>customer2.getAccount().getBalance()){
			if(customer2.getAccount().getBalance()>customer3.getAccount().getBalance()){
				customer1.getAccount().withdraw((customer1.getAccount().getBalance()/2));
				customer3.getAccount().deposit((customer1.getAccount().getBalance()/2));
			}
			else { 
					if((customer1.getAccount().getBalance()>customer3.getAccount().getBalance())){
					customer2.getAccount().withdraw((customer2.getAccount().getBalance()/2));
					customer3.getAccount().deposit((customer2.getAccount().getBalance()/2));
				}
					else{
						if(customer2.getAccount().getBalance()>customer3.getAccount().getBalance()){
						customer2.getAccount().withdraw((customer2.getAccount().getBalance()/2));
						customer1.getAccount().deposit((customer2.getAccount().getBalance()/2));
						}
						else {
							customer3.getAccount().withdraw((customer3.getAccount().getBalance()/2));
							customer1.getAccount().deposit((customer3.getAccount().getBalance()/2));
					}
				}
			}
		}

		System.out.println(customer1.getLastName() + " " + customer1.getFirstName() + "고객의 계좌 잔액은 " + (int)customer1.getAccount().getBalance() + "원입니다.");
		System.out.println(customer2.getLastName() + " " + customer2.getFirstName() + "고객의 계좌 잔액은 " + (int)customer2.getAccount().getBalance() + "원입니다.");
		System.out.println(customer3.getLastName() + " " + customer3.getFirstName() + "고객의 계좌 잔액은 " + (int)customer3.getAccount().getBalance() + "원입니다.");
	}
		
		

	}


