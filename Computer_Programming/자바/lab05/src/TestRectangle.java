import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		Scanner input = new Scanner(System.in);
		System.out.print("���簢���� ���ΰ� �Է�: ");
		rectangle1.height = input.nextDouble();
		System.out.print("���簢���� ���ΰ� �Է�: ");
		rectangle1.width = input.nextDouble();
		System.out.println("���簢���� ����: "  + rectangle1.area() + "\n���簢���� �ѷ�: " + rectangle1.perimeter());
		input.close();
	}
}
