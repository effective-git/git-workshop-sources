package de.effectivetrainings.operation;

/**
 * @author Martin Dilger
 * @since: 10.07.14
 */
public class Cos implements Operation
{

	@Override
	public Double perform(Double operandA, Double operandB)
	{
		return Math.cos(operandA);
	}

	@Override
	public String getOperationIdentifier()
	{
		return "cos";
	}
}
