import java.util.Scanner;
public class Dice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("��ȸ �ֻ����� �������?");
		int tries = input.nextInt();
		int[][] dice = new int[6][6];
		
	
		for(int i = 0; i < tries; i++){
			int x=(int)(Math.random()*6)+1;
			int y=(int)(Math.random()*6)+1;
			dice[x-1][y-1]++;
		}
		
		System.out.println(tries + "ȸ �ֻ����� ���� ���");
		PrintArray printDice = new PrintArray();
		printDice.printArray(dice);
	}

}
