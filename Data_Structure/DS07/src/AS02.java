
public class AS02 {

	public static void main(String[] args) {

		// Q. 양의 정수를 이진수로 변환한 문자열을 리턴하는 순환 함수를 작성하고 테스트하라.
		System.out.println("Dec. to Binary \n-------------");
		for (int n = 0; n < 9; n++) {
			System.out.println(n + " -> " + DecimalToBinaryString(n));
		}

	}

	public static String DecimalToBinaryString(int n) {
		if (n < 2)
			return Integer.toString(n);
		else
			return DecimalToBinaryString(n / 2) + Integer.toString(n % 2);
	}
}
