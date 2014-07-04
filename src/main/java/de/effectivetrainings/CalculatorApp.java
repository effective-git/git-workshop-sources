package de.effectivetrainings;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calc = initializeCalculator();

		System.out.println("Running Calculator");
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		while (scanner.hasNext()) {
			String input = scanner.next();
			InputMatcher inputMatcher = new InputMatcher(input);
			System.out.println(calc.calculate(inputMatcher.getOperation(),
					inputMatcher.getOperandA(), inputMatcher.getOperandB()));
		}

		scanner.close();
	}

	/**
	 * initializes the calculator and registers operations necessary.
	 */
	private static Calculator initializeCalculator() {
		Calculator calculator = new Calculator();
		//
		// register operations here
		//
		return calculator;
	}

}
