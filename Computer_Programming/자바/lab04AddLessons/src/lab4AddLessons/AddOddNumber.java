package lab4AddLessons;

import java.util.Scanner;

public class AddOddNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		int result = 0;
		System.out.print("숫자를 입력 하시오: ");
		number = input.nextInt();
		for( int i = 0; i < number; i++ ){
			if( i % 2 != 0 ) result += i;
		}
		
		System.out.println(number + "까지 홀수의 총 합은 " + result + "입니다.");
		input.close();
	}
}
