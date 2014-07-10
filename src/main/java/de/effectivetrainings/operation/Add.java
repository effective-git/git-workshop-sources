package de.effectivetrainings.operation;

/**
 * @author Martin Dilger
 * @since: 10.07.14
 */
public class Add implements Operation
{

	@Override
	public Double perform(Double operandA, Double operandB)
	{
		return operandA + operandA;
	}

	@Override
	public String getOperationIdentifier()
	{
		return "+";
	}
}
