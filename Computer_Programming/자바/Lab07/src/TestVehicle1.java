
public class TestVehicle1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(10000.0);
		
		System.out.println("Creating a vehicle with a "+vehicle.getMaxLoad());
		System.out.println("Add box #1 (500kg)"); vehicle.load+=500;
		System.out.println("Add box #2 (250kg)"); vehicle.load+=250;
		System.out.println("Add box #3 (5000kg)");vehicle.load+=5000;
		System.out.println("Add box #4 (4000kg)");vehicle.load+=4000;
		System.out.println("Add box #5 (300kg)");vehicle.load+=300;
		System.out.println("Vehicle load is "+vehicle.getLoad());

	}

}
