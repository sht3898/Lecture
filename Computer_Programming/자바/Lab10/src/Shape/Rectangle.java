package Shape;

public class Rectangle extends Shape {
	int width, length;
	public Rectangle(int w, int l){
		width=w;
		length=l;
	}
	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
	}
	
	@Override
	public double area() {
		return width*length;
	}
}
