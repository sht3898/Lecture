import java.util.Scanner;
public class Printing {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�.");
		String s=input.nextLine();
		s=s.toLowerCase();
		int a=0, b=0;
		char c;
		for(int i=0;i<s.length();i++){
			c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				a++;
			else
				b++;
			
		}
		System.out.println("������ ����: "+a);
		System.out.println("������ ����: "+b);
		input.close();
	}

}
