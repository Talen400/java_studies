package operations;

public class Addition implements Operation {
	public double apply(double a, double b) { return a + b; }
	public char symbol() { return '+'; }
}
