package grade_management_system;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int _userNumber = 0;
		boolean _userConfirm = true;
		Student S1 = new Student();
		while (_userConfirm) {
			System.out.println("****************************************\n <���� ���� �ý���>");
			System.out.println("1.���� �Է��ϱ�");
			System.out.println("2.����ǥ ����ϱ�");
			System.out.println("3.GMS �����ϱ�");
			System.out.println("****************************************");
			System.out.print("��ȣ�� �Է��ϼ���(1~3): ");
			_userNumber = input.nextInt();
			

			switch (_userNumber) {
			case 1:

				System.out.print("\n�ڼ��� �Է��ϱ��\n �̸� : ");S1.setName(input.next());
				System.out.print("�й� : ");			S1.setStudentNumber(input.nextInt());			
				System.out.print("�߰���� ���� (0~100��): ");		S1.getRe().setScoreOfExam(input.nextInt());
				System.out.print("�⸻��� ���� (0~100��): ");		S1.getRe().setScoreOfSecondExam(input.nextInt());
				System.out.print("�� ������Ʈ ����(0~10��) : ");		S1.getRe().setGradeOfTermProject(input.nextInt());
				System.out.print("��� ����(����:Ƚ��; 20ȸ ���ϸ� F) : ");		S1.getRe().SetOfAttendance(input.nextInt());
				break;
				
			case 2:
				System.out.println("\n�ڼ���ǥ ����ϱ��");
				
				S1.getRe().printRun(S1);
				break;

			case 3:
				System.out.println("GMS�� �����մϴ�.");
				_userConfirm = false;
				break;
			default:
				System.out.println("1-3�� ���ڸ� �Է����ּ���.");
			}

		}input.close();
	}
}
