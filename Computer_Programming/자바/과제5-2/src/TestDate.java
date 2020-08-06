import java.util.Scanner;
public class TestDate {

	public static void main(String[] args) {
		Date date1=new Date();
		Scanner input=new Scanner(System.in);
		System.out.print("연도 입력: ");
		date1.year=input.nextInt();
		System.out.print("월 입력: ");
		date1.month=input.nextInt();
		System.out.print("일 입력: ");
		date1.day=input.nextInt();
		System.out.print("동양식 날짜 표현: ");
		date1.printEastern();
		System.out.print("\n서양식 날짜 표현: ");
		date1.printWestern();
		input.close();

	}

}
