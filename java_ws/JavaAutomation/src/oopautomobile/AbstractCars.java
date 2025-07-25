package oopautomobile;

/*
 * abstract can be defined 2 days with abstract keyword and interfaces
 * abstract class no need to have any abstract method BUT 
 * if class has abstract method Class must be defined as abstract
 * Abstract class can be extended but Can Not be initiated with object
 */
public abstract class AbstractCars {

	// variable
	private int absSpeed;

	// constructor
	public AbstractCars(int absSpeed) {
		this.absSpeed = absSpeed;
	}

	// getters and setters
	public int getAbsSpeed() {
		return absSpeed;
	}

	public void setAbsSpeed(int absSpeed) {
		this.absSpeed = absSpeed;
	}

	// custom method
	public void engineStart() {
		System.out.println("Engine Started");
	}

	// abstract method only define in abstract class - does not have any body but only parameter
	public abstract void carPerformance(String keyType, int numOfCyl);

}
