package de.effectivetrainings.operation;

/**
 * @author Martin Dilger
 * @since: 10.07.14
 */
public class Half implements Operation
{

	@Override
	public Double perform(Double operandA, Double operandB)
	{
		return operandA / 2;
	}

	@Override
	public String getOperationIdentifier()
	{
		return "halb";
	}
}
