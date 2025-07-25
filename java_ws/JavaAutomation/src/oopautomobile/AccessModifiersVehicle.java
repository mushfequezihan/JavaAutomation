package oopautomobile;

public class AccessModifiersVehicle {

	public static void main(String[] args) {

		//access modifier example
		AccessModifierCar cam = new AccessModifierCar();
		
		cam.noModifierSpeed = 10;					//variable available due to no modifier
		cam.setPrivateoilChange(10);	 //variable not available but access through setter method
		cam.publiccCarType = 0;				//public variable access through anywhere
		cam.protectedCarWheel = 100;	// ONLY available in same package class and subclass - not other package
		cam.setProtectedCarWheel(0);	// check access in CAR class
	}

}
