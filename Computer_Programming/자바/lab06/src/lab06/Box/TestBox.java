package lab06.Box;

public class TestBox {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();
		
		b1.setHeight(100);
		b1.setLength(100);
		b1.setWidth(100);

		b2.setHeight(200);
		b2.setLength(200);
		b2.setWidth(200);
		
		System.out.println("Box b1�� ����: " + b1.getVolume());
		System.out.println("Box b2�� ����: " + b2.getVolume());
		
		System.out.print("Box b1�� �Ӽ�: ");
		b1.print();
		System.out.print("Box b2�� �Ӽ�: ");
		b2.print();
	}
}
