package de.effectivetrainings;

import de.effectivetrainings.operation.Add;
import de.effectivetrainings.operation.Bool;
import de.effectivetrainings.operation.Cos;
import de.effectivetrainings.operation.Div;
import de.effectivetrainings.operation.Half;
import de.effectivetrainings.operation.Minus;
import de.effectivetrainings.operation.Mod;
import de.effectivetrainings.operation.Mult;
import de.effectivetrainings.operation.Neg;
import de.effectivetrainings.operation.Quadrat;
import de.effectivetrainings.operation.Sin;
import de.effectivetrainings.operation.Sqrt;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calc = initializeCalculator();

		System.out.println("Running Calculator");
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		while (scanner.hasNext()) {
			try {
			String input = scanner.next();
			InputMatcher inputMatcher = new InputMatcher(input);
			System.out.println(calc.calculate(inputMatcher.getOperation(),
					inputMatcher.getOperandA(), inputMatcher.getOperandB()));
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("Error - cannot calculate because : " + e.getMessage());
			}
		}

		scanner.close();
	}

	/**
	 * initializes the calculator and registers operations necessary.
	 */
	private static Calculator initializeCalculator() {
		Calculator calculator = new Calculator();
		calculator.registerOperation(new Add());
		calculator.registerOperation(new Minus());
		calculator.registerOperation(new Mult());
		calculator.registerOperation(new Div());
		calculator.registerOperation(new Mod());
		calculator.registerOperation(new Neg());
		calculator.registerOperation(new Half());
		calculator.registerOperation(new Quadrat());
		calculator.registerOperation(new Sqrt());
		calculator.registerOperation(new Sin());
		calculator.registerOperation(new Cos());
		calculator.registerOperation(new Bool());


		//
		// register operations here
		//
		return calculator;
	}

}
