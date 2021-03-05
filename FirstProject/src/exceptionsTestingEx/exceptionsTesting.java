package exceptionsTestingEx;

public class exceptionsTesting {

	public static void main(String[] args) {
		Divide game1 = new Divide(1, 0);

		try {
			game1.printAnswer();
		} catch (ArithmeticException ae) {
			System.out.println("Maths Exception");
		} catch (Number2LargerThanNumber1Exception nltne) {
			System.out.println("You have input a number2 larger than your number1- so to speak!");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
