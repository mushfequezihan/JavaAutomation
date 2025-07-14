package datatypes;

public class Sample {
	
	//static GLOBAL vars
	static double doubleVarGlobal;
	static boolean boolVarGlobal;
	static char charVarGlobal;
	

	public static void main(String[] args) {

		// Testing java codes with eclipse git workflow
		/*
		 * 
		 */
		System.out.println("I love Coffee!");
		System.out.println("Java means Coffee LOL");
		System.out.println(1+2);
		System.out.println("");
		
		//data types
		byte byteVar = 100; // -128 to 127
		System.out.println("Byte value: " + byteVar);
		System.out.println("");
		
		short shortVar = 1000; 
		System.out.println("Short value: " + shortVar);
		System.out.println("");
		
		int intVar = 10000;
		System.out.println("INT value: " + intVar);
		System.out.println("");
		
		long longVar = 1000000000000000L;
		System.out.println("long value: " + longVar);
		System.out.println("");
		
		float floatVar = 20.5f;
		System.out.println("float value: " + floatVar);
		System.out.println("");
		
		double doubleVar = 60.33;
		System.out.println("double value: " + doubleVar);
		System.out.println("");
		
		boolean boolVar = true;
		System.out.println("Boolean value: " + boolVar);
		System.out.println("");
		
		char charVar = 65535; //ASCAI value
		System.out.println("CHAR value: " + charVar);
		System.out.println("");
		
		char cVar = '&'; 
		System.out.println("CHAR value: " + cVar);
		System.out.println("");
		
		
		// static global variable access with default value
		System.out.println("global double value: " + doubleVarGlobal);	
		System.out.println("global boolean value: " + boolVarGlobal);	
		System.out.println("global CHAR value: " + charVarGlobal);	
		System.out.println("");
		
		oneMoreMethod(); // method call
	}
	
	//scope of variables only global is accessible not local in method
	public static void oneMoreMethod() {
		System.out.println("varible access in Method for double: " + doubleVarGlobal);
	}

	
}
