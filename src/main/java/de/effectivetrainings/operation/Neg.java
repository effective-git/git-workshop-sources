package de.effectivetrainings.operation;

/**
 * @author Martin Dilger
 * @since: 10.07.14
 */
public class Neg implements Operation
{

	@Override
	public Double perform(Double operandA, Double operandB)
	{
		return operandA * -1;
	}

	@Override
	public String getOperationIdentifier()
	{
		return "*-";
	}
}
