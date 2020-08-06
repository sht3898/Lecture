package lab06.Account;

import java.util.Scanner;

public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		Scanner input = new Scanner(System.in);

		System.out.println("첫 번째 계좌의 정보를 입력하시오.");
		System.out.print("계좌번호: ");
		account1.accountNumber = input.nextLine();
		System.out.print("예금주: ");
		account1.owner = input.nextLine();
		System.out.print("초기 잔액: ");
		account1.balance = input.nextInt();

		input.nextLine();//buffer 비우기 위함
		System.out.println();
		System.out.println("두 번째 계좌의 정보를 입력하시오.");
		System.out.print("계좌번호: ");
		account2.accountNumber = input.nextLine();
		System.out.print("예금주: ");
		account2.owner = input.nextLine();
		System.out.print("초기 잔액: ");
		account2.balance = input.nextInt();

		
		System.out.println();
		int amount;
		System.out.print("첫 번째 계좌에서 두 번째 계좌로 송금할 금액: ");
		amount = input.nextInt();
		if( account1.transfer(amount, account2) ){
			System.out.println("송금 완료");
		} else {
			System.out.println("잔액 부족");
		}
		System.out.println();
		System.out.println("첫 번째 계좌의 정보: " + account1);
		System.out.println("두 번째 계좌의 정보: " + account2);

		input.close();
	}
	
}
