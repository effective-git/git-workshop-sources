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
		//calculating sqrt for operandA
		return Math.sqrt(operandA);
	}

	@Override
	public String getOperationIdentifier()
	{
		//operator sqrt
		return "sqrt";
	}
}
