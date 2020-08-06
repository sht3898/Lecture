package lab3;

import java.util.Scanner;

public class BicNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2;
		System.out.print("첫 번째 수를 입력하시오: ");
		num1 = input.nextInt();
		System.out.print("두 번째 수를 입력하시오: ");
		num2 = input.nextInt();
		
		System.out.println("두 수 중 더 큰 숫자는 " + (num1 > num2 ? num1 : num2) + " 입니다.");
		input.close();
	}
}
