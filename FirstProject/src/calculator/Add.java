package calculator;

public class Add {

	public static int method1(int num1, int num2) {

		int q = num1 + num2;
		return q;

	}

	public static int method2(int num1, int num2) {

		int q = num1 * num2;
		return q;

	}

	public static int method3(int num1, int num2) {

		int q = num1 - num2;
		return q;

	}

	public static void method4(double num1, double num2) {

		double q = num1 / num2;

		if (num2 < num1) {
			System.out.println(q);
		} else {
			System.out.println("division cannot be performed");
		}

	}

	public static void main(String[] args) {
		System.out.println(method1(1, 2));
		System.out.println(method2(1, 2));
		System.out.println(method3(8, 2));
		method4(8, 3);

	}

}
