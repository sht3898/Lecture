package Shape;

public class Triangle extends Shape {
	int line, height;
	public Triangle(int l, int h){
		line=l;
		height=h;
	}

	@Override
	public void draw() {
		System.out.println("Triangle Draw");
	}

	@Override
	public double area() {
		return line*height/2;

	}

}
