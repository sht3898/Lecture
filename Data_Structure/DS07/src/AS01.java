
public class AS01 {

	public static void main(String[] args) {

		// Q. 10.8���� exp() �޼ҵ��� �ݺ��� ��ȯ ���� ��� ���� �ƴ� ������ ���ؼ��� ����� �����Ѵ�.
		// ������ �޼ҵ带 ���� ������ ���ؼ��� ����� �����ϵ��� �����ϰ� �׽�Ʈ�϶�.

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
	 * ������ x^n�� ���� ���
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
	 * ������ x^n�� ���� ��� n�� ¦���̸�, (x^2)^(n/2) n�� Ȧ���̸�, x*((x^2)^((n-1)/2))
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
