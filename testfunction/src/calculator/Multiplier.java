package calculator;

public abstract class Multiplier {
	
	int multiply(int... operands) {
	int	result=1;
	for (int operand : operands) {
		result *= operand; //This is where multiplier work
	}
	return result;
	
	}
	
	
}
