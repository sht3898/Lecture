package banking;

public class Bank {
	private Customer[] customers;
	private int numberofCustomers=0;
	
	public Bank(){
		super();
		customers=new Customer[10];
	}
	public void addCustomer(Customer customer){
		customers[numberofCustomers]=customer;
	}
	public int getNumOfCustomers(){
		return numberofCustomers;
	}
	public Customer getCustomer(int index){
		return customers[index];
	}
}
