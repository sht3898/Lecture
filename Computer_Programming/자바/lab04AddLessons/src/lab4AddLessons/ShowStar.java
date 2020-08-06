package lab4AddLessons;

public class ShowStar {
	public static void main(String[] args) {
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 5 - j; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= (j * 2) - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int j = 4; j >= 1; j--) {
			for (int i = 0; i <= 4 - j; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= (j * 2) - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
