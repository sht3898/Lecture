package banking;

public class Bank {
	Customer[] customers;
	int numberofCustomers;
	
	public Bank(){
		customers=new Customer[10];
	}
	public void addCustomer(Customer[] customer){
		customers=customer;
	}
	public int getNumOfCustomers(){
		return numberofCustomers;
	}
	public Customer getCustomer(int index){
		return customers[index];
	}

}
