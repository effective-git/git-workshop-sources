package de.effectivetrainings.operation;

/**
 * @author Martin Dilger
 * @since: 10.07.14
 */
public class Quadrat implements Operation
{

	@Override
	public Double perform(Double operandA, Double operandB)
	{
		return operandA * operandB;
	}

	@Override
	public String getOperationIdentifier()
	{
		return "qdr";
	}
}
