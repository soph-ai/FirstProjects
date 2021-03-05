package exceptionsTestingEx;

public class Divide {

	public double number1;
	public double number2;

	public Divide(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public void printAnswer() throws Number2LargerThanNumber1Exception {
		if (number1 < number2) {
			throw new Number2LargerThanNumber1Exception();
		} else if (number2 == 0) {
			throw new ArithmeticException();
		}
		System.out.println(number1 / number2);
	}
}
