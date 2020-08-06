package rollDice;
import java.util.Scanner;
public class Dice {

	public static void main(String[] args) {
		int[][] dice = new int[6][6];
		int x=0;
		int y=0;
		int num=0;
		
		System.out.print("몇회 주사위를 던질까요?");
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		
		for(int i=1;i<=num;i++){
			x=(int)((Math.random()*6));
			y=(int)((Math.random()*6));
			dice[x][y]++;
		}
		for(int i=0;i<6;i++){
			System.out.print('<');
			for(int j=0;j<6;j++){
				System.out.print(dice[i][j]);
				
				if((j<5))
					System.out.print(", ");
			}
			System.out.println('>');
		}
	}

}
