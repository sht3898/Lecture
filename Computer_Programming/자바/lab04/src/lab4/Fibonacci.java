package lab4;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int exNum1 = 0, exNum2 = 1, curNum;
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("�� ��° ������ ���Ͻðڽ��ϱ�? ");
		n = input.nextInt();
		
		System.out.print( exNum1 + " " + exNum2 + " ");
		for(int i = 2; i < n; i++ ){
			curNum = exNum1 + exNum2;
			exNum1 = exNum2;
			exNum2 = curNum;
			System.out.print( curNum + " ");
		}
	}
}
