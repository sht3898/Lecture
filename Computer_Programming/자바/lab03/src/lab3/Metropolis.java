package lab3;

import java.util.Scanner;

public class Metropolis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int capital;
		int population;
		int richs;
		boolean isMetro;
		System.out.print("수도입니까?(수도: 1, 수도아님: 0): ");
		capital = input.nextInt();
		System.out.print("인구(단위: 백만): ");
		population = input.nextInt();
		System.out.print("부자의 수(단위: 백만): ");
		richs = input.nextInt();
		isMetro = ((capital == 1)&& population>=100) || richs >= 50;
		System.out.println("메트로폴리스 여부: " + isMetro);
		
		input.close();
	}
}
