package lab3;

import java.util.Scanner;

public class twosComplement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է� �Ͻÿ�: ");
		int num = input.nextInt();
		int nNum = (~num)+1;
		System.out.println("�Է��Ͻ� ���� " + num + "�̰�, �Է��Ͻ� ���� 2�� ������ " + nNum + "�̴�.");
		System.out.println("�� ���� ���ϸ� " + ( num + nNum ) +"�� ���´�.");
		
		input.close();
	}
}
