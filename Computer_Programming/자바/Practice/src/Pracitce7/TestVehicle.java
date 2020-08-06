package Pracitce7;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(10000.0);
		System.out.println(vehicle.getMaxLoad());
		System.out.println(vehicle.addBox(500.0));
		System.out.println(vehicle.addBox(250.0));
		System.out.println(vehicle.addBox(5000.0));
		System.out.println(vehicle.addBox(4000.0));
		System.out.println(vehicle.addBox(300.0));
		System.out.println(vehicle.getLoad());
	}

}
