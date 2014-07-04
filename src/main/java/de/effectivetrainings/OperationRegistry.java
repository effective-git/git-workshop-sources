package de.effectivetrainings;

import java.util.HashMap;
import java.util.Map;

import de.effectivetrainings.operation.Operation;

public class OperationRegistry {

	private Map<String, Operation> operations = new HashMap<String, Operation>();

	public Operation get(String key) {
		return operations.get(key);
	}

	public void set(Operation operation) {
		if (operations.containsKey(operation.getOperationIdentifier())) {
			throw new IllegalStateException("Operation for Identifier "
					+ operation.getOperationIdentifier()
					+ " already registered");
		}
		operations.put(operation.getOperationIdentifier(), operation);
	}
}
