package de.effectivetrainings.operation;

/**
 * @author Martin Dilger
 * @since: 10.07.14
 */
public class Pow implements Operation
{

	@Override
	public Double perform(Double operandA, Double operandB)
	{
		return Math.pow(operandA, operandB);
	}

	@Override
	public String getOperationIdentifier()
	{
		return "^";
	}
}
