
public class AS01 {

	public static void main(String[] args) {

		// Q. 10.8절의 exp() 메소드의 반복과 순환 버전 모두 음이 아닌 지수에 대해서만 제대로 동작한다.
		// 각각의 메소드를 음의 지수에 대해서도 제대로 동작하도록 수정하고 테스트하라.

		// exp_Loop
		System.out.println("Use Loop --------------------");
		for (int n = -3; n < 4; n++) {
			System.out.println("2^(" + n + ")  : " + exp_Loop(2, n));
		}

		// exp_Recursion
		System.out.println("\nUse Recursion --------------------");
		for (int n = -3; n < 4; n++) {
			System.out.println("2^(" + n + ")  : " + exp_Recursion(2, n));
		}
	}

	/**
	 * 지수식 x^n에 대한 계산
	 * 
	 * @param x
	 * @param n
	 * @return
	 */
	public static double exp_Loop(double x, int n) {
		double y = 1.0;

		if (n < 0) {
			x = 1 / x;
			n = -n;
		}

		for (int i = 0; i < n; i++) {
			y *= x;
		}

		return y;
	}

	/**
	 * 지수식 x^n에 대한 계산 n이 짝수이면, (x^2)^(n/2) n이 홀수이면, x*((x^2)^((n-1)/2))
	 * 
	 * @param x
	 * @param n
	 * @return
	 */
	public static double exp_Recursion(double x, int n) {

		double factor = (n % 2 == 0 ? 1.0 : x);

		if (n < 2 && n >= 0)
			return factor;

		if (n < 0)
			return 1 / factor * exp_Recursion(x * x, n / 2);
		else
			return factor * exp_Recursion(x * x, n / 2);
	}
}
