package java_function_practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CharacterCounterTest {
	private CharacterCounter UnderCharacterCounter;
	
	@BeforeEach
	void setUp() throws Exception {
		UnderCharacterCounter = new CharacterCounter();
	}

	@Test
	public void test() {
		int result = 5;
		
		assertEquals(result, UnderCharacterCounter.CountCharInString("545454545",'5'));
		
		result = 5;
		
		assertEquals(result, UnderCharacterCounter.CountCharInString("545454545",'5'));
		
		result = 5;
		
		assertEquals(result, UnderCharacterCounter.CountCharInString("545454545",'5'));
		
		result = 5;
		
		assertEquals(result, UnderCharacterCounter.CountCharInString("545454545",'5'));
		
		result = 5;
		
		assertEquals(result, UnderCharacterCounter.CountCharInString("545454545",'5'));
		
		result = 5;
		
		assertEquals(result, UnderCharacterCounter.CountCharInString("545454545",'5'));
		
		result = 5;
		
		assertEquals(result, UnderCharacterCounter.CountCharInString("545454545",'5'));
		
		result = 5;
		
		assertEquals(result, UnderCharacterCounter.CountCharInString("545454545",'5'));
		
		result = 5;
		
		assertEquals(result, UnderCharacterCounter.CountCharInString("545454545",'5'));

		

	}

}
