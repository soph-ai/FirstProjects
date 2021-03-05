package results;

public class examResults {

	public static int Physics;
	public static int Chemistry;
	public static int Biology;

	public static int total;
	public static double percentage;

	public static void main(String[] args) {

		Physics = 140;
		Chemistry = 120;
		Biology = 100;

		System.out.println(method1());
		System.out.println(method2());
	}

	public static String method1() {
		total = Physics + Chemistry + Biology;
		double pp = (Physics * 100) / 150;
		double cp = (Chemistry * 100) / 150;
		double bp = (Biology * 100) / 150;

		if (pp < 60) {
			return pp + "You failed physics!";
		} else if (cp < 60) {
			return "You failed chemsitry!";
		} else if (bp < 60) {
			return "You failed biology!";
		} else if (pp >= 60 && cp >= 60 && bp >= 60) {
			return "Physics:" + Physics + " Chemistry:" + Chemistry + " Biology:" + Biology + " Total:" + total;
		} else {
			return "Some other combo I missed";
		}
	}

	public static String method2() {

		total = Physics + Chemistry + Biology;
		percentage = (total * 100) / 450;

		if (percentage >= 60) {
			return "Percentage:" + percentage + "% You passed overall!";
		} else {
			return "You failed";
		}

	}
}
