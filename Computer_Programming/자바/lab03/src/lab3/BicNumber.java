package lab3;

import java.util.Scanner;

public class BicNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2;
		System.out.print("ù ��° ���� �Է��Ͻÿ�: ");
		num1 = input.nextInt();
		System.out.print("�� ��° ���� �Է��Ͻÿ�: ");
		num2 = input.nextInt();
		
		System.out.println("�� �� �� �� ū ���ڴ� " + (num1 > num2 ? num1 : num2) + " �Դϴ�.");
		input.close();
	}
}
