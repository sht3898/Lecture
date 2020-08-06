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
		System.out.println("������ ������ ���̴�: "+width);
		System.out.println("������ ������ ���̴�: "+length);
		System.out.println("������ ���̴�: "+height);
		System.out.println("������ ���Ǵ�: "+getVolume());
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
	System.out.println("Box b1�� ����: "+b1.getVolume());
	System.out.println("Box b2�� ����: "+b2.getVolume());
	System.out.println("Box b1�� �Ӽ�: ���� "+b1.getWidth()+" ���� "+b1.getLength()+" ���� "+b1.getHeight());
	System.out.println("Box b2�� �Ӽ�: ���� "+b2.getWidth()+" ���� "+b2.getLength()+" ���� "+b2.getHeight());
	

}
}