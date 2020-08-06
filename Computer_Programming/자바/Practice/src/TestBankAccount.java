import java.util.Scanner;
public class TestBankAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		System.out.println("첫번째 계좌의 정보를 입력하시오.");
		System.out.print("계좌번호: ");
		account1.accountNumber = input.next();
		System.out.print("예금주:");
		account1.owner= input.next();
		System.out.print("초기 잔액: ");
		account1.balance = input.nextInt();
		System.out.println("두번째 계좌의 정보를 입력하시오.");
		System.out.print("계좌번호: ");
		account2.accountNumber = input.next();
		System.out.print("예금주:");
		account2.owner= input.next();
		System.out.print("초기 잔액: ");
		account2.balance = input.nextInt();
		
		System.out.print("첫번째 계좌에서 두번째 계좌로 송금할 금액:");
		account1.transfer(input.nextInt(), account2);
		
		System.out.println(account1);
		System.out.println(account2);
	}

}
