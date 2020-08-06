package lab3;

import java.util.Scanner;

public class TwosSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("수를 입력 하시오: ");
		num = input.nextInt();
		
		System.out.println(num + "의 2배수는 " + (num<<1) + "입니다.");
		System.out.println(num + "의 4배수는 " + (num<<2) + "입니다.");
		System.out.println(num + "의 8배수는 " + (num<<3) + "입니다.");
		
		input.close();
	}
}
