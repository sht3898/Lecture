import java.util.Scanner;

public class VowelsAndConsonantsCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��Ͻÿ�. ");
		String t = input.nextLine();
		int consonantCount = 0, vowelCount = 0;
		t = t.toLowerCase();
		char ch;
		for (int i = 0; i < t.length(); i++) {
			ch = t.charAt(i);
			if( ch < 123 && ch > 96 ){
				if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' ) vowelCount++;
				else consonantCount++;
			}
		}
		System.out.println("������ ����: " + consonantCount + "��\n������  ����: " + vowelCount +"��");
	}
}
