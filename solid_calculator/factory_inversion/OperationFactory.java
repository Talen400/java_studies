package factory_inversion;

import operations.Operation;
import operations.Addition;
import operations.Subtraction;
import operations.Multiply;
import operations.Division;

public class OperationFactory {
	public static Operation fromSymbol(char symbol) {
		switch (symbol) {
			case '+':
				return new Addition();
			case '-':
				return new Subtraction();
			case '*':
				return new Multiply();
			case '/':
				return new Division();
			default:
				throw new IllegalArgumentException("Invalid symbol math.");
		}
	}

}
