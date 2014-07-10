package de.effectivetrainings.operation;

/**
 * @author Martin Dilger
 * @since: 10.07.14
 */
public class Bool implements Operation
{

	@Override
	public Double perform(Double operandA, Double operandB)
	{
		return operandA == operandB ? 1.0 : 0.0;
	}

	@Override
	public String getOperationIdentifier()
	{
		return "==";
	}
}
