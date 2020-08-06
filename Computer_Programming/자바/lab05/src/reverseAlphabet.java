import java.util.Scanner;

public class reverseAlphabet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String string = input.nextLine();
		
		for( int i = string.length()-1; i >= 0; i-- ){
			System.out.print(string.charAt(i));
		}
	}
}
