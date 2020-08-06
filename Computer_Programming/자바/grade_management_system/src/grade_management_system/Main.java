package grade_management_system;

import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int _userNumber = 0;
		boolean _userConfirm = true;

		while (_userConfirm) {
			System.out.println("/n********************");
			System.out.println("1.성적 입력하기");
			System.out.println("2.성적표 출력하기");
			System.out.println("3.GMS 종료하기");
			System.out.println("/n********************");
			System.out.println("번호를 선택하세요: " + _userNumber);
			_userNumber = input.nextInt();

			switch (_userNumber) {
			case 1:
				Student S1 = new Student();
				
				System.out.println("\n★성적 입력하기★");
				for (int i = 0; i < S1.; i++) {
					System.out.print(S1._StudentInput[i] + "과목의 성적을 입력하세요: ");
					S1._StudentInput[i] = input.nextInt();
				}

			case 2:
				System.out.println("\n★성적표 출력하기★");

			case 3:
				System.out.println("GMS를 종료합니다.");
				_userConfirm = false;
				break;
			default:
				System.out.println("1-3의 숫자를 입력해주세요.");
			}

		}
	}
}
