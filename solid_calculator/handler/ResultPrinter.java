package handler

public class ResultPrinter {
	public void PrintResult(double a, char op, double b, double result) {
		System.out.println("Result: " + a + " " + op + " " + b + " = " + result);
	}

	public void printError(String message) {
		System.out.println("Error: " + message);
	}
}
