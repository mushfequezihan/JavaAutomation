package classmethods;

/*
 * difference in data types of arguments
 */
public class OverloadingCar2 {

	public static void main(String[] args) {

		increaseSeatHeight(2);
		increaseSeatHeight("8");
	}

	//same methods different parameter
	public static void increaseSeatHeight(int height) {

		System.out.println("Increase Seat height by " + height + " inches - 1st method type int");
	}
	
	public static void increaseSeatHeight(String height) {

		System.out.println("Increase Seat height by " + height + " inches - 2nd method tupe string");
	}
}
