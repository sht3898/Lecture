package Chapter10;
import java.util.Scanner;
public class Theather {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i=1;
		int j=0;
		int[] arr = {0,0,0,0,0,1,1,1,0,0};
		
		while(i!=0){
			System.out.print("�¼��������Ͻðڽ��ϱ� (1�Ǵ�0) : ");
			i = input.nextInt();
			
			if(i == 1)
			{
				System.out.println("�����ǿ�����´´����������ϴ�.");
				System.out.println("----------------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10");
				for(int k = 0; k < 10; k++)
					System.out.print(arr[k] + " ");
				System.out.println("");
				System.out.print("���°�¼��������Ͻðڽ��ϱ� : ");
				j = input.nextInt();
				if(arr[j-1] == 1)
					System.out.println("�� �¼��� �̹� ����Ǿ��ִ� �¼��Դϴ�.");
				else
				{
					arr[j-1] = 1;
					System.out.println("����Ǿ����ϴ�.");
				}
			}
		}input.close();
	}
}
