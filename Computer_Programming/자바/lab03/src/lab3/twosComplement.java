package lab3;

import java.util.Scanner;

public class twosComplement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("수를 입력 하시오: ");
		int num = input.nextInt();
		int nNum = (~num)+1;
		System.out.println("입력하신 수는 " + num + "이고, 입력하신 수의 2의 보수는 " + nNum + "이다.");
		System.out.println("두 수를 더하면 " + ( num + nNum ) +"이 나온다.");
		
		input.close();
	}
}
