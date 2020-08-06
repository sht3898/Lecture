package lab4AddLessons;

public class Factorial {
	public static void main(String[] args) {
		int result = 1;
		for( int i = 0; i < 15; i++ ) result *=(i+1);
		System.out.println("15!의 결과값: " + result);
	}
}
