
public class Plane {
	private String company;
	private String model;
	private int maxCustomer;
	private static int planes=0;
	public void setPlane(String c,String m,int max){
		company = c;
		model = m;
		maxCustomer = max;
	}
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public int getMaxCustomer(){
		return maxCustomer;
	}
	public Plane()
	{
		company = "에어버스";
		model = "A380";
		maxCustomer = 500;
		planes++;
	}
	public Plane(String production, String model)
	{
		this.company = production;
		this.model = model;
		planes++;
	}
	public static int getPlanes()
	{
		return planes;
	}
	
}
