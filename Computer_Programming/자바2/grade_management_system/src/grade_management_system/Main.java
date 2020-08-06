package grade_management_system;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int _userNumber = 0;
		boolean _userConfirm = true;
		Student S1 = new Student();
		while (_userConfirm) {
			System.out.println("****************************************\n <성적 관리 시스템>");
			System.out.println("1.성적 입력하기");
			System.out.println("2.성적표 출력하기");
			System.out.println("3.GMS 종료하기");
			System.out.println("****************************************");
			System.out.print("번호를 입력하세요(1~3): ");
			_userNumber = input.nextInt();
			

			switch (_userNumber) {
			case 1:

				System.out.print("\n★성적 입력하기★\n 이름 : ");S1.setName(input.next());
				System.out.print("학번 : ");			S1.setStudentNumber(input.nextInt());			
				System.out.print("중간고사 성적 (0~100점): ");		S1.getRe().setScoreOfExam(input.nextInt());
				System.out.print("기말고사 성적 (0~100점): ");		S1.getRe().setScoreOfSecondExam(input.nextInt());
				System.out.print("텀 프로젝트 점수(0~10점) : ");		S1.getRe().setGradeOfTermProject(input.nextInt());
				System.out.print("출결 사항(단위:횟수; 20회 이하면 F) : ");		S1.getRe().SetOfAttendance(input.nextInt());
				break;
				
			case 2:
				System.out.println("\n★성적표 출력하기★");
				
				S1.getRe().printRun(S1);
				break;

			case 3:
				System.out.println("GMS를 종료합니다.");
				_userConfirm = false;
				break;
			default:
				System.out.println("1-3의 숫자를 입력해주세요.");
			}

		}input.close();
	}
}
