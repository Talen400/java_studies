package factory_inversion

import package operations.Operation;
import package operations.Addition;
import package operations.Subtraction;
import package operations.Multiplication;
import package operations.Division;

public class OperationFactory {
	public static Operation fromSysbol(char symbol) {
		switch (symbol) {
			case "+":
				return new Addition();
			case "-":
				return new Subtraction();
			case "*":
				return new Multiply();
			case "/":
				return new Division();
			default:
				throw new IllegalArgumentException("Invalid symbol math.");
		}
	}

}
