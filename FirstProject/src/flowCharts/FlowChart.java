package flowCharts;

public class FlowChart {

	public static void main(String[] args) {
		int A = 100;
		while (A < 200) {
			System.out.println(A);
			A++;
		}
		System.out.println("loop2");
		int B = 100;
		while (B <= 200) {
			if (B % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			B++;

		}
		System.out.println("loop3");

		for (int i = 1; i <= 10; i++)

			for (int j = 0; j < 10; j++) {
				System.out.println(i);

			}

		System.out.println("loop5");

		for (int i = 1; i <= 10; i++)

			for (int j = 0; j <= i; j++) {
				System.out.println(i);

			}

	}

}
