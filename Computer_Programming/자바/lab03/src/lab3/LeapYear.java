package lab3;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		System.out.print("�⵵�� �Է��Ͻÿ�: ");
		year = input.nextInt();
		String leapYearString = (((year % 4 ==0)&&year % 100 != 0) ||  year % 400 == 0)==true ? "�����Դϴ�." : "������ �ƴմϴ�.";
		System.out.println(year+"���� " + leapYearString);
		
		input.close();
	}
}
