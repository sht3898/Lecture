package lab06.Account;

import java.util.Scanner;

public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		Scanner input = new Scanner(System.in);

		System.out.println("ù ��° ������ ������ �Է��Ͻÿ�.");
		System.out.print("���¹�ȣ: ");
		account1.accountNumber = input.nextLine();
		System.out.print("������: ");
		account1.owner = input.nextLine();
		System.out.print("�ʱ� �ܾ�: ");
		account1.balance = input.nextInt();

		input.nextLine();//buffer ���� ����
		System.out.println();
		System.out.println("�� ��° ������ ������ �Է��Ͻÿ�.");
		System.out.print("���¹�ȣ: ");
		account2.accountNumber = input.nextLine();
		System.out.print("������: ");
		account2.owner = input.nextLine();
		System.out.print("�ʱ� �ܾ�: ");
		account2.balance = input.nextInt();

		
		System.out.println();
		int amount;
		System.out.print("ù ��° ���¿��� �� ��° ���·� �۱��� �ݾ�: ");
		amount = input.nextInt();
		if( account1.transfer(amount, account2) ){
			System.out.println("�۱� �Ϸ�");
		} else {
			System.out.println("�ܾ� ����");
		}
		System.out.println();
		System.out.println("ù ��° ������ ����: " + account1);
		System.out.println("�� ��° ������ ����: " + account2);

		input.close();
	}
	
}
