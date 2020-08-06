package Bank;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers = 0;
	public Bank() {
		super();
		customers = new Customer[10];
	}
	
	public void addCustomer( Customer customer ){
		customers[numberOfCustomers++] = customer;
	}
	
	public int getNumofCustomers(){
		return numberOfCustomers;
	}
	
	public Customer getCustomer( int index ){
		return customers[index];
	}
	
}
