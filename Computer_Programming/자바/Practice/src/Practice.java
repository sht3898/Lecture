abstract class Shape{
	int x, y;
	public void move(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
}
public class Practice extends Shape{
	int width, height;
	public void draw(){
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
};

class Circle extends Shape{
	int radius;
	public void draw(){
		System.out.println("�� �׸��� �޼ҵ�");
	}
}
