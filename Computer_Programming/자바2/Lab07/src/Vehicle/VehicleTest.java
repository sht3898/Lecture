package Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(10000.0);
		
		System.out.println("Creation a vehicle with a "+vehicle.getMaxLoad()+"kg maximum load.");
		System.out.println("Add box #1 (500)kg");
		vehicle.load += 500;
		System.out.println("Add box #2 (250)kg");
		vehicle.load += 250;
		System.out.println("Add box #3 (5000)kg");
		vehicle.load += 5000;
		System.out.println("Add box #4 (4000)kg");
		vehicle.load += 4000;
		System.out.println("Add box #5 (300)kg");
		vehicle.load += 300;
		System.out.println("Vehicle load is "+vehicle.getLoad());
	}

}
