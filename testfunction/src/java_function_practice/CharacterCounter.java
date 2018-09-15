package java_function_practice;

public class CharacterCounter {
	private int count;
	
	public int CountCharInString (String string, char charactor) {
		
		count = 0;
		char[] charString = string.toCharArray();
		for (int i =0; i < charString.length; i++) {
			if( charString[i] == charactor) count++;
		}
		return count;
	}
}
