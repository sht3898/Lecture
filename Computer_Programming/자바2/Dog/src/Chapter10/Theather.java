package Chapter10;
import java.util.Scanner;
public class Theather {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i=1;
		int j=0;
		int[] arr = {0,0,0,0,0,1,1,1,0,0};
		
		while(i!=0){
			System.out.print("좌석을예약하시겠습니까 (1또는0) : ");
			i = input.nextInt();
			
			if(i == 1)
			{
				System.out.println("현재의예약상태는다음과같습니다.");
				System.out.println("----------------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10");
				for(int k = 0; k < 10; k++)
					System.out.print(arr[k] + " ");
				System.out.println("");
				System.out.print("몇번째좌석을예약하시겠습니까 : ");
				j = input.nextInt();
				if(arr[j-1] == 1)
					System.out.println("그 좌석은 이미 예약되어있는 좌석입니다.");
				else
				{
					arr[j-1] = 1;
					System.out.println("예약되었습니다.");
				}
			}
		}input.close();
	}
}
