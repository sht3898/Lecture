import java.util.Scanner;

public class TestDate {
	
//	public static void main(String[] args) {
//		Movie movie = new Movie();
//		movie.poroducer = "봉준호";
//		movie.title = "괴물";
//		movie.score = 8.61;
//		movie.publishDate = "2006년 07월 27일";
//		
//		movie.print();
//	}
	/** 과제 1
	 * @param args
	 */
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("문자열을 입력하시오. ");
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
//		System.out.println("자음의 개수는 " + consonantCount + "이고, 모음의 개수는 " + vowelCount +  "이다.");
//	}
	/**
	 * 역순출력
	 * @param args
	 */
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("문자열을 입력하시오. ");
//		String string = input.nextLine();
//		
//		for( int i = string.length()-1; i >= 0; i-- ){
//			System.out.print(string.charAt(i));
//		}
//	}
	
	
	/** 날짜 메인함수
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		Scanner input = new Scanner(System.in);
		System.out.print("연도 입력: ");
		date.year = input.nextInt();
		System.out.print("월 입력: ");
		date.month = input.nextInt();
		System.out.print("일 입력: ");
		date.day = input.nextInt();
		
		System.out.print("동양식 날짜 표현: ");
		date.printEastern();
		System.out.print("미국식 날짜 표현: ");
		date.printWestern();
	}
	
	/**
	 * Rectangle 메인함수
	 * @param args
	 */
//	public static void main(String[] args) {
//		Rectangle rc = new Rectangle();
//		rc.h = 5.0;
//		rc.w = 15.0;
//		System.out.println("만들어진 사각형의 넓이는 "  + rc.area() + " 이고, 둘레는 " + rc.perimeter() + " 이다.");
//	}
}
