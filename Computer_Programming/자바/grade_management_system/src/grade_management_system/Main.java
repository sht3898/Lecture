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
			System.out.println("1.���� �Է��ϱ�");
			System.out.println("2.����ǥ ����ϱ�");
			System.out.println("3.GMS �����ϱ�");
			System.out.println("/n********************");
			System.out.println("��ȣ�� �����ϼ���: " + _userNumber);
			_userNumber = input.nextInt();

			switch (_userNumber) {
			case 1:
				Student S1 = new Student();
				
				System.out.println("\n�ڼ��� �Է��ϱ��");
				for (int i = 0; i < S1.; i++) {
					System.out.print(S1._StudentInput[i] + "������ ������ �Է��ϼ���: ");
					S1._StudentInput[i] = input.nextInt();
				}

			case 2:
				System.out.println("\n�ڼ���ǥ ����ϱ��");

			case 3:
				System.out.println("GMS�� �����մϴ�.");
				_userConfirm = false;
				break;
			default:
				System.out.println("1-3�� ���ڸ� �Է����ּ���.");
			}

		}
	}
}
