import java.util.Scanner;
public class TestBankAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		System.out.println("ù��° ������ ������ �Է��Ͻÿ�.");
		System.out.print("���¹�ȣ: ");
		account1.accountNumber = input.next();
		System.out.print("������:");
		account1.owner= input.next();
		System.out.print("�ʱ� �ܾ�: ");
		account1.balance = input.nextInt();
		System.out.println("�ι�° ������ ������ �Է��Ͻÿ�.");
		System.out.print("���¹�ȣ: ");
		account2.accountNumber = input.next();
		System.out.print("������:");
		account2.owner= input.next();
		System.out.print("�ʱ� �ܾ�: ");
		account2.balance = input.nextInt();
		
		System.out.print("ù��° ���¿��� �ι�° ���·� �۱��� �ݾ�:");
		account1.transfer(input.nextInt(), account2);
		
		System.out.println(account1);
		System.out.println(account2);
	}

}
