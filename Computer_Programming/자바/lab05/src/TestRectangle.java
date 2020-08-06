import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		Scanner input = new Scanner(System.in);
		System.out.print("직사각형의 세로값 입력: ");
		rectangle1.height = input.nextDouble();
		System.out.print("직사각형의 가로값 입력: ");
		rectangle1.width = input.nextDouble();
		System.out.println("직사각형의 넓이: "  + rectangle1.area() + "\n직사각형의 둘레: " + rectangle1.perimeter());
		input.close();
	}
}
