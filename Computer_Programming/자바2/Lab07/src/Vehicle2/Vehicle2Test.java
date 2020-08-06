package Vehicle2;

public class Vehicle2Test {

	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2(10000.0);
		
		System.out.println("Creation a vehicle with a "+vehicle2.getMaxLoad()+"kg maximum load.");
		System.out.println("Add box #1 (500)kg");
		vehicle2.addBox(500);
		System.out.println("Add box #2 (250)kg");
		vehicle2.addBox(250);
		System.out.println("Add box #3 (5000)kg");
		vehicle2.addBox(5000);
		System.out.println("Add box #4 (4000)kg");
		vehicle2.addBox(4000);
		System.out.println("Add box #5 (300)kg");
		vehicle2.addBox(300);
		System.out.println("Vehicle load is "+vehicle2.getLoad());
	
	}

}
