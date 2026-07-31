import operations.Operation;
import handler.InputReader;
import handler.Result.Printer;
import factory_inversion.OperationFactory;


public class Calculator {
	public static void main(String[]  args) {
	
		InputReader reader = new InputReader();
		ResultPrinter printer = new ResultPrinter();

		System.out.println("--- Java Terminal Calculator ---");
		double num1 = reader.readNumber("Enter first number: ");
		char opSymbol = reader.readOperator("Enter second number: ");
		double num2 = reader.readNumber("Enter second number: ");

		try {
			Operation operation = OperationFactory.fromSymbol(opSymbol);
			double result = operation.apply(num1, num2);
			printer.printResult(num1, opSymbol, num2, result);
		} catch (IllegalArgumentException | ArithmeticException e) {
			printer.printError(e.getMessage);
		} finally {
			reader.close();
		}

}
