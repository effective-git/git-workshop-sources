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
		//adding up 2 operands
		return operandA + operandB;
	}

	@Override
	public String getOperationIdentifier()
	{
		//operator +
		return "+";
	}
}
