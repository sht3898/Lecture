package Shape;

public class Circle extends Shape{
int radius;
	
	public Circle(int r){
		radius = r;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
	}

	@Override
	public double area() {
		return radius*radius*Math.PI;
	}

}
