package Shape;

public class Triangle extends Shape{
	private int width, height;
	
	public Triangle(int w, int h){
		width = w;
		height = h;
	}
	
	public void draw(){
		System.out.println("Triangle");
	}
	public double area(){
		return width*height*1/2;
	}
}
