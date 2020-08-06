package MileToKilo;
class Car{
	int i = 1;
	public void ride(){
		System.out.print("Car");
	}
}
class SnowCar extends Car{
	int i = 10;
	public void ride(){
		System.out.print("SnowCar"); 
	}
}
public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car snowcar = new SnowCar();
		Car car1 = snowcar;
		System.out.println(snowcar.i);
		System.out.println(car1.i);
		
	}

}
