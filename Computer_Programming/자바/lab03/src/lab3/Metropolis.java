package lab3;

import java.util.Scanner;

public class Metropolis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int capital;
		int population;
		int richs;
		boolean isMetro;
		System.out.print("�����Դϱ�?(����: 1, �����ƴ�: 0): ");
		capital = input.nextInt();
		System.out.print("�α�(����: �鸸): ");
		population = input.nextInt();
		System.out.print("������ ��(����: �鸸): ");
		richs = input.nextInt();
		isMetro = ((capital == 1)&& population>=100) || richs >= 50;
		System.out.println("��Ʈ�������� ����: " + isMetro);
		
		input.close();
	}
}
