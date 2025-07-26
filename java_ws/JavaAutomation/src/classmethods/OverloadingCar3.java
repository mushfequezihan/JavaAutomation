package classmethods;

/*
 * sequence of data types of arguments
 */

public class OverloadingCar3 {

	public static void main(String[] args) {
		
		increaseSeatHeight(2, "test");
		increaseSeatHeight("test2", 8);
	}

	//same method but data type sequence is different
	public static void increaseSeatHeight(int height, String var) {

		System.out.println("Increase Seat height by " + height + " inches - 1st method " + var);
	}
	
	public static void increaseSeatHeight(String var, int height) {

		System.out.println("Increase Seat height by " + height + " inches - 2nd method " + var);
	}
}
