package de.effectivetrainings.operation;

/**
 * @author Martin Dilger
 * @since: 10.07.14
 */
public class Sin implements Operation
{

	@Override
	public Double perform(Double operandA, Double operandB)
	{
		return Math.sin(operandA);
	}

	@Override
	public String getOperationIdentifier()
	{
		return "sin";
	}
}
