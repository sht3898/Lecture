package Shape;

public class Rectangle extends Shape{
	private int width, length;
	
	public Rectangle(int w, int l){
		width = w;
		length = l;
	}
	
	public void draw(){
		System.out.println("Rectangle");
	}
	public double area(){
		return width*length;
	}
}
