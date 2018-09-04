package testfunction;

public class person {
	public static void generateID() {
		int personalID = (int)(Math.random()*1000 + 1);
		System.out.println(personalID);
	}
}
