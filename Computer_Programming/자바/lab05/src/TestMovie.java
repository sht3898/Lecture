import java.util.Scanner;

public class TestMovie {
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Scanner input = new Scanner(System.in);
		
		System.out.print("��ȭ���� �Է�: ");
		movie1.title = input.nextLine();
		System.out.print("��ȭ���� �Է�: ");
		movie1.director = input.nextLine();
		System.out.print("��ȭ�����⵵ �Է�: ");
		movie1.year = input.nextInt();
		System.out.print("��ȭ���� �Է�: ");
		movie1.rating = input.nextDouble();
		
		System.out.println("=========================");
		movie1.print();
	}
}
