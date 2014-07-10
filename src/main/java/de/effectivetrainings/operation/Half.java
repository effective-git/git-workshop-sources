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
		//dividing operand A by 2
		return operandA / 2;
	}

	@Override
	public String getOperationIdentifier()
	{
		//operator half
		return "halb";
	}
}
