import java.util.Scanner;
public class Dice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("몇회 주사위를 던질까요?");
		int tries = input.nextInt();
		int[][] dice = new int[6][6];
		
	
		for(int i = 0; i < tries; i++){
			int x=(int)(Math.random()*6)+1;
			int y=(int)(Math.random()*6)+1;
			dice[x-1][y-1]++;
		}
		
		System.out.println(tries + "회 주사위를 던진 결과");
		PrintArray printDice = new PrintArray();
		printDice.printArray(dice);
	}

}
