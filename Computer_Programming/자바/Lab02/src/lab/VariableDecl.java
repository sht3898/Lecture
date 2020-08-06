package lab;

public class VariableDecl {
	public static void main(String[] args) {
		int num1, num2;
		double num3, num4;
		num1 = 3;
		num2 = 4;
		num3 = 5;
		num4 = 6.3;
		System.out.println("Add#1: " + num1 + num2);
		System.out.println("Add#2: " + num1 + num4);
		System.out.println("Mul#1: " + (int) (num2 * num4));
		System.out.println("Mul#2: " + num1 * num3);
	}
}