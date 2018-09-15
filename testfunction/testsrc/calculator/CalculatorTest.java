package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator cal;
	@BeforeEach
	void setUp() throws Exception {
		cal = new Calculator();
	}

	@Test
	void testSubtract() {
		int result =0;
		assertEquals(result,cal.subtract(-5,4,1));
		
		result = 10;
		assertEquals(result,cal.subtract(-10,3,2,1,4,-10));
		
	}

	@Test
	void testAdd() {
		int result =17;
		assertEquals(result,cal.add(8,4,3,2));
		
		result = 20;
		assertEquals(result,cal.add(10,3,2,1,4));
		
	}

}
