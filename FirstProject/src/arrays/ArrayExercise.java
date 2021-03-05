package arrays;

public class ArrayExercise {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("ex2");
		int[] arr2 = new int[10];

		for (int i = 0; i < 10; i++) {
			int z = i + 1;
			arr2[i] = z;
			System.out.println(arr2[i]);
		}

		System.out.println("ex3");
		for (int i = 0; i < 10; i++) {

			arr2 = new int[10];
			int z = i + 1;
			int y = z * 10;
			arr2[i] = y;
			System.out.println(arr2[i]);
		}

	}

}
