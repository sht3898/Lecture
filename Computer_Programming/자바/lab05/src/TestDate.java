import java.util.Scanner;

public class TestDate {
	
//	public static void main(String[] args) {
//		Movie movie = new Movie();
//		movie.poroducer = "����ȣ";
//		movie.title = "����";
//		movie.score = 8.61;
//		movie.publishDate = "2006�� 07�� 27��";
//		
//		movie.print();
//	}
	/** ���� 1
	 * @param args
	 */
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("���ڿ��� �Է��Ͻÿ�. ");
//		String string = input.nextLine();
//		int consonantCount = 0,vowelCount = 0;
//		
//		for( int i = string.length()-1; i >= 0; i-- ){
//			char distinctionChar = string.toLowerCase().charAt(i);
//			if(distinctionChar == 'a' || 
//			   distinctionChar == 'e' ||
//			   distinctionChar == 'i' ||
//			   distinctionChar == 'o' ||
//			   distinctionChar == 'u'){
//				vowelCount++;
//			} else if( distinctionChar > 96 && distinctionChar < 123 ){
//				consonantCount++;
//			}
//		}
//		System.out.println("������ ������ " + consonantCount + "�̰�, ������ ������ " + vowelCount +  "�̴�.");
//	}
	/**
	 * �������
	 * @param args
	 */
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("���ڿ��� �Է��Ͻÿ�. ");
//		String string = input.nextLine();
//		
//		for( int i = string.length()-1; i >= 0; i-- ){
//			System.out.print(string.charAt(i));
//		}
//	}
	
	
	/** ��¥ �����Լ�
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		date.year = input.nextInt();
		System.out.print("�� �Է�: ");
		date.month = input.nextInt();
		System.out.print("�� �Է�: ");
		date.day = input.nextInt();
		
		System.out.print("����� ��¥ ǥ��: ");
		date.printEastern();
		System.out.print("�̱��� ��¥ ǥ��: ");
		date.printWestern();
	}
	
	/**
	 * Rectangle �����Լ�
	 * @param args
	 */
//	public static void main(String[] args) {
//		Rectangle rc = new Rectangle();
//		rc.h = 5.0;
//		rc.w = 15.0;
//		System.out.println("������� �簢���� ���̴� "  + rc.area() + " �̰�, �ѷ��� " + rc.perimeter() + " �̴�.");
//	}
}
