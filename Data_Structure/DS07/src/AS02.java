
public class AS02 {

	public static void main(String[] args) {

		// Q. ���� ������ �������� ��ȯ�� ���ڿ��� �����ϴ� ��ȯ �Լ��� �ۼ��ϰ� �׽�Ʈ�϶�.
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
