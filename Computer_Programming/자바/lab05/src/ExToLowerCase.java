import java.util.Scanner;

public class ExToLowerCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		String test = input.nextLine();
		System.out.println("toLowerCase() ���� �� ���ڿ�: " + test.toLowerCase());
	}
}
