import java.util.Scanner;
public class TestDate {

	public static void main(String[] args) {
		Date date1=new Date();
		Scanner input=new Scanner(System.in);
		System.out.print("���� �Է�: ");
		date1.year=input.nextInt();
		System.out.print("�� �Է�: ");
		date1.month=input.nextInt();
		System.out.print("�� �Է�: ");
		date1.day=input.nextInt();
		System.out.print("����� ��¥ ǥ��: ");
		date1.printEastern();
		System.out.print("\n����� ��¥ ǥ��: ");
		date1.printWestern();
		input.close();

	}

}
