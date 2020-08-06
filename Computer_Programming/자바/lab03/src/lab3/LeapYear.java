package lab3;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		System.out.print("년도를 입력하시오: ");
		year = input.nextInt();
		String leapYearString = (((year % 4 ==0)&&year % 100 != 0) ||  year % 400 == 0)==true ? "윤년입니다." : "윤년이 아닙니다.";
		System.out.println(year+"년은 " + leapYearString);
		
		input.close();
	}
}
