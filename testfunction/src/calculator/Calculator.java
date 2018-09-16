package calculator;

public class Calculator implements Adder,Subtrator,divider{

	@Override
	public int subtract(int... operands) {
		// TODO Auto-generated method stub
		int sum = 0;
		for ( int operand : operands) {
			sum-=operand; // Added when try to edit master branch after edited feature branch
		}
		return sum;
	}

	@Override
	public int add(int... operands) {
		// TODO Auto-generated method stub
		int sum = 0;
		for ( int operand : operands) {
			sum+=operand;
		}
		return sum;
	}

	@Override
	public int divide(int... operands) {
		// TODO Auto-generated method stub
		int sum = 1;
		for ( int operand : operands) {
			sum /= operand;
		}
		return sum;
	}	

}
