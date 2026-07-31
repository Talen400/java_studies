package operations;

public class Division implements Operation {
	public double apply(double a, double b) { 
		if (b == 0)
			throw new ArithmeticException("Division by zero is undefined");
		return a / b; }
	public char symbol() { return '/'; }
}
