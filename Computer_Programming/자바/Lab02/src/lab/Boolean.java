package lab;

import java.util.Scanner;

public class Boolean {
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하시오   ");
		double r = in.nextDouble();
		double result = (5.0/9.0)*(r-32);
		System.out.println("섭씨온도는 " + (float)result + "입니다.");
	}
}