package lab;

import java.util.Scanner;

public class Boolean {
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in);
		System.out.print("ȭ�� �µ��� �Է��Ͻÿ�   ");
		double r = in.nextDouble();
		double result = (5.0/9.0)*(r-32);
		System.out.println("�����µ��� " + (float)result + "�Դϴ�.");
	}
}