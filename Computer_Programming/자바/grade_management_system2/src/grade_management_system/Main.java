package grade_management_system;

import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RuleOfAbsoluteEvaluation re = new RuleOfAbsoluteEvaluation();
		int _userNumber = 0;
		boolean _userConfirm = true;

		while (_userConfirm) {
			System.out.println("/n********************");
			System.out.println("1.성적 입력하기");
			System.out.println("2.성적표 출력하기");
			System.out.println("3.GMS 종료하기");
			System.out.println("/n********************");
			System.out.println("번호를 입력하세요: ");
			_userNumber = input.nextInt();

			switch (_userNumber) {
			case 1:
				Student S1 = new Student();
				
				System.out.println("\n★성적 입력하기★");
				System.out.print("이름 : ");S1.setName(input.next());
				System.out.print("학번 : ");S1.setStudentNumber(input.nextInt());
				System.out.print("중간고사 성적 : ");re.setScoreOfExam(input.nextInt());
				System.out.print("텀 프로젝트 학점 : ");re.setGradeOfTermProject(input.next());
				System.out.print("출결 사항(단위:횟수) : ");re.setTimesOfAttendance(input.nextInt());
				
				
//				for (int i = 0; i < (re._studentInput).length; i++) {
//					System.out.print(S1._studentInput[i] + "과목의 성적을 입력하세요: ");
//					S1._StudentInput[i] = input.nextInt();
//				}

			case 2:
				PrintReportCard pc = new PrintReportCard();
				System.out.println("\n★성적표 출력하기★");
				pc.printRun();


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
