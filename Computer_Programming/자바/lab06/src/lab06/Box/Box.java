package lab06.Box;

public class Box {
	int width;
	int height;
	int length;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getVolume(){
		return width*height*length;
	}
	
	public void print(){
		System.out.println("가로 " + width + ", 세로 " + length + ", 높이 " + height);
	}
}
