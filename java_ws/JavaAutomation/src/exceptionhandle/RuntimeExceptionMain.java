package exceptionhandle;

//exception at runtime calculation 
public class RuntimeExceptionMain {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int c;
		
		c = b/a;
		System.out.println("b/a result: " + c);
		
		// for catching runtime exception
		try {
			c = a/b;
			System.out.println(" a/b result: " + c);
		} catch (ArithmeticException e) {
			System.out.println(" a/b result: " + e.getMessage());
			System.out.println("division by 0 is not possible");
		}
		
		
		System.out.println("");
		int[] nums = {1,2,3};
		
		try {
			
			for (int i = 0; i <= 3; i++) {
				System.out.println("test values: " + nums[i]);
			}
		} catch (Exception e) {
			System.out.println("No index available in Array after 2 - size: " + nums.length);
			System.out.println(e.getMessage());
		}
		
	}

}
