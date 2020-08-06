class Box {
	public int width;
	public int length;
	public int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int w){
		width=w;
	}
	public int getLength(){
		return length;
	}
	public void setLength(int l){
		length=l;
	}
	public int getHeight(){
		return height;
	}
	public void setHeight(int h){
		height=h;
	}
	public int getVolume(){
		int volume;
		volume=width*length*height;
		return volume;
	}
	public void print(){
		System.out.println("상자의 가로의 길이는: "+width);
		System.out.println("상자의 세로의 길이는: "+length);
		System.out.println("상자의 높이는: "+height);
		System.out.println("상자의 부피는: "+getVolume());
	}
	

}

public class TestBox {
	public static void main(String[] args){
	Box b1=new Box();
	b1.setWidth(100);
	b1.setLength(100);
	b1.setHeight(100);
	Box b2=new Box();
	b2.setWidth(200);
	b2.setLength(200);
	b2.setHeight(200);
	System.out.println("Box b1의 부피: "+b1.getVolume());
	System.out.println("Box b2의 부피: "+b2.getVolume());
	System.out.println("Box b1의 속성: 가로 "+b1.getWidth()+" 세로 "+b1.getLength()+" 높이 "+b1.getHeight());
	System.out.println("Box b2의 속성: 가로 "+b2.getWidth()+" 세로 "+b2.getLength()+" 높이 "+b2.getHeight());
	

}
}