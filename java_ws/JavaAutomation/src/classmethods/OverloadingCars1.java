package classmethods;

/*
 * different number of parameter in argument list
 *  
 *  */

public class OverloadingCars1 {

	// 1. Number of parameter could be different
	// 2. data types of parameter are different
	// 3. sequence of data type is different
	public static void main(String[] args) {

		increaseSeatHeight(2);
		increaseSeatHeight(8, false);
	}

	//same name method with different arguments
	public static void increaseSeatHeight(int height) {

		System.out.println("Increase Seat height by " + height + " inches - 1st method");
	}

	public static void increaseSeatHeight(int height, boolean rememberHeight) {

		System.out.println("Increase Seat height by " + height + " inches - 2nd method");
		if (rememberHeight) {
			System.out.println("Your selection is saved");
		}else {
			System.out.println("your selection is not saved");
		}
	}

}
