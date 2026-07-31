import java.util.Scanner;

public class InputReader {
	private final Scanner scanner = new Scanner(System.in);

	public double readNumber(String prompt) {
		System.out.print(prompt);
		return scanner.nextDouble();
	}

	public char readOperator(String prompt) {
		System.out.print(prompt);
		return scanner.next().charAt(0);
	}

	public void close() {
		scanner.close();
	}

}
