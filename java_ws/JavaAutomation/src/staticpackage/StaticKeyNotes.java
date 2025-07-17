package staticpackage;

public class StaticKeyNotes {
	
	/*
	 * Static method can not use the non static variable or method directly
	 * this and super cannot be used in static context
	 */
	
	//class variable
	public int addNum = 10;
	
	//static class variable
	public static int addNumStatic = 100;

	//main method
	public static void main(String[] args) {
		
		//to access non static variable through class object
		StaticKeyNotes s1 = new StaticKeyNotes();
	
		//non static
		int output = s1.sum(20);
		System.out.println("The output is: " + output);
		
		//static
		int staticOutput = staticSum(20);
		System.out.println("The output is: " + staticOutput);
	}

	
	//simple methods static and not static 
	public int sum(int num) {
		
		return num + addNum;
	}
	
	public static int staticSum(int num) {
		
		return num + addNumStatic;
	}
	
}
