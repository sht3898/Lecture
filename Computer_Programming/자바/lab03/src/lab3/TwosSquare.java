package lab3;

import java.util.Scanner;

public class TwosSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("���� �Է� �Ͻÿ�: ");
		num = input.nextInt();
		
		System.out.println(num + "�� 2����� " + (num<<1) + "�Դϴ�.");
		System.out.println(num + "�� 4����� " + (num<<2) + "�Դϴ�.");
		System.out.println(num + "�� 8����� " + (num<<3) + "�Դϴ�.");
		
		input.close();
	}
}
