package lab4;

import java.util.Scanner;

public class GradeCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comp;
		int OO;
		int db;
		System.out.print("��ǻ�����α׷���1 ������ ������ �Է��Ͻÿ�: ");
		comp = sc.nextInt();
		System.out.print("��ü���⼳�� ������ ������ �Է��Ͻÿ�: ");
		OO = sc.nextInt();
		System.out.print("�����ͺ��̽� ������ ������ �Է��Ͻÿ�: ");
		db = sc.nextInt();
		
		int sum = comp + OO + db;
		double avg = sum / 3.0;
		
		char hak;
		
		if( (int)avg >= 90 ) hak = 'A';
		else if( (int)avg >= 80 ) hak = 'B';
		else if( (int)avg >= 70 ) hak = 'C';
		else if( (int)avg >= 60 ) hak = 'D';
		else hak = 'F';
		
		System.out.printf("����: %d\n���: %.2f\n����: %C",sum,avg,hak);
	}
}
