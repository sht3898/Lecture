import java.util.Scanner;

public class ExToLowerCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("문자 입력: ");
		String test = input.nextLine();
		System.out.println("toLowerCase() 적용 후 문자열: " + test.toLowerCase());
	}
}
