package de.effectivetrainings;

import de.effectivetrainings.operation.Operation;

public class Calculator {

	private OperationRegistry registry = new OperationRegistry();

	private Double lastResult = 0d;

	public Double calculate(String operationIdentifier, Double a, Double b) {
		Operation operation = findOperation(operationIdentifier);
		a = a == null ? lastResult : a;
		lastResult = operation.perform(a, b);
		return lastResult;
	}

	public void registerOperation(Operation operation) {
		registry.set(operation);
	}

	private Operation findOperation(String operationIdentifier) {
		Operation operation = registry.get(operationIdentifier);
		if (operation == null) {
			throw new IllegalStateException(
					"No Operation available for Identifier "
							+ operationIdentifier);
		}
		return operation;
	}
}
