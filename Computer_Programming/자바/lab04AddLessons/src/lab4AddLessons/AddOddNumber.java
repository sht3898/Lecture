package lab4AddLessons;

import java.util.Scanner;

public class AddOddNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		int result = 0;
		System.out.print("���ڸ� �Է� �Ͻÿ�: ");
		number = input.nextInt();
		for( int i = 0; i < number; i++ ){
			if( i % 2 != 0 ) result += i;
		}
		
		System.out.println(number + "���� Ȧ���� �� ���� " + result + "�Դϴ�.");
		input.close();
	}
}
