package oopautomobile;

public class AccessModifierCar {
	
	//check Honda and Car class

	// no modifier/default modifier - accessible in the same package
	int noModifierSpeed;

	// only in class - access through setters
	private int privateOilChange;

	// custom.setter method
	public void setPrivateoilChange(int pOilChange) {

		pOilChange = this.privateOilChange;
	}

	// anywhere in java world with importing the package and class
	public int publiccCarType;

	// available within same package but accessible to subclass even its outside of package
	protected int protectedCarWheel;

	protected void setProtectedCarWheel(int wheel) {

		wheel = this.protectedCarWheel;
	}
}
