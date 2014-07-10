package de.effectivetrainings.operation;

/**
 * @author Martin Dilger
 * @since: 10.07.14
 */
public class Div implements Operation
{

	@Override
	public Double perform(Double operandA, Double operandB)
	{
		//dividing the 2 operands
		return operandA / operandB;
	}

	@Override
	public String getOperationIdentifier()
	{
		//operator /
		return "/";
	}
}
