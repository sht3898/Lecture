
public class Rectangle {
	
	static int count = 0;
//	���ΰ�
//	���ΰ�
	double width;
	double height;
	/**
	 * ���簢���� ���� ���ϴ� �Լ�
	 * @return ����
	 */
	public double area(){
		return width*height;
	}
	/**
	 * ���簢���� �ѷ� ���ϴ� �Լ�
	 * @return �ѷ�
	 */
	public double perimeter(){
		return width*2 + height*2;
	}
}
