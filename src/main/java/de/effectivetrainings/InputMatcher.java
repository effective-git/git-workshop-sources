package de.effectivetrainings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputMatcher {

	private static final String inputPattern = "\\s*(\\d*)\\s*(\\W+|\\w+|\\b+)\\s*(\\d*)\\s*";

	private static Pattern pattern = Pattern.compile(inputPattern);

	private Double operandA;
	private Double operandB;
	private String operation;

	public InputMatcher(String input) {
		if(input == null || input.isEmpty()) {
			//ignore empty input
			return;
		}
		Matcher matcher = pattern.matcher(input);
		if (!matcher.matches()) {
			throw new IllegalArgumentException("Input has invalid format : "
					+ input + ". Expected " + inputPattern);
		}

		String rawOperandA = matcher.group(1);
		if (rawOperandA != null && !rawOperandA.isEmpty()) {
			this.operandA = Double.parseDouble(rawOperandA);
		}
		operation = matcher.group(2).trim();
		// operand B is mandatory
		String rawOperandB = matcher.group(3);
		if(rawOperandB != null && !rawOperandB.isEmpty()) {
			operandB = Double.parseDouble(rawOperandB);
		}
	}

	public Double getOperandA() {
		return operandA;
	}

	public Double getOperandB() {
		return operandB;
	}

	public String getOperation() {
		return operation;
	}

}
