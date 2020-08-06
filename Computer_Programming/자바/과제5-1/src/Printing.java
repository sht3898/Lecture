import java.util.Scanner;
public class Printing {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("문자열을 입력하시오.");
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
		System.out.println("모음의 개수: "+a);
		System.out.println("자음의 개수: "+b);
		input.close();
	}

}
