package lab4;

import java.util.Scanner;

public class GradeCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comp;
		int OO;
		int db;
		System.out.print("컴퓨터프로그래밍1 과목의 점수를 입력하시오: ");
		comp = sc.nextInt();
		System.out.print("객체지향설계 과목의 점수를 입력하시오: ");
		OO = sc.nextInt();
		System.out.print("데이터베이스 과목의 점수를 입력하시오: ");
		db = sc.nextInt();
		
		int sum = comp + OO + db;
		double avg = sum / 3.0;
		
		char hak;
		
		if( (int)avg >= 90 ) hak = 'A';
		else if( (int)avg >= 80 ) hak = 'B';
		else if( (int)avg >= 70 ) hak = 'C';
		else if( (int)avg >= 60 ) hak = 'D';
		else hak = 'F';
		
		System.out.printf("총점: %d\n평균: %.2f\n학점: %C",sum,avg,hak);
	}
}
