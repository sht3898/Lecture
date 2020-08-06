package banking;

public class Bank {
	Customer[] customers ;
	int numberOfCustomers=0;
	
	public Bank(){
		customers=new Customer[10];
	}
	public void addCustomer(Customer customer){
		customers[numberOfCustomers] = customer;
		numberOfCustomers=numberOfCustomers+1;
	}
	public int getnumberCustomers(){
		return numberOfCustomers;
	}
	public Customer getCustomer(int index){
		return customers[index];
	}

}
