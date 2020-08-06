package Shape;

public class Circle extends Shape{
	private int radius;
	
	public Circle(int r){
		radius=r;
	}
	public void draw(){
		System.out.println("Circle");
	}
	public double area(){
		return radius*radius*Math.PI;
	}
	
	
	
}
