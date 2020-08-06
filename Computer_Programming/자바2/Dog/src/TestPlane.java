
public class TestPlane {

	public static void main(String[] args) {
		Plane plane1 = new Plane();
		Plane plane2 = new Plane("Company", "B380");
		
		System.out.println(plane1.getCompany() + ", " + plane1.getModel() + ", " + plane1.getMaxCustomer());
		plane2.setPlane("Company", "B380", 600);
		System.out.println(plane2.getCompany() + ", " + plane2.getModel() + ", " + plane2.getMaxCustomer());
		System.out.println("积己等 Plane 按眉狼 荐 : " + Plane.getPlanes());	}

}
