package de.effectivetrainings.operation;

/**
 * @author Martin Dilger
 * @since: 10.07.14
 */
public class Sqrt implements Operation
{

	@Override
	public Double perform(Double operandA, Double operandB)
	{
		return Math.sqrt(operandA);
	}

	@Override
	public String getOperationIdentifier()
	{
		return "sqrt";
	}
}
