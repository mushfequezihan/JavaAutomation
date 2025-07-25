package oopautomobile;

public class VehicleInheritBMW extends VehicleInherit{

	//constructor invoking Vehicle constructor
	public VehicleInheritBMW(int speed) {
		super(speed);
	}

	@Override
	public void increaseSpeed() {
		super.increaseSpeed();
		System.out.println("Increasing SPEED of BMW ++");
	}

	//BMW specific method
	public void headupDisplayNav() {
		
		System.out.println("BMW specific functionality");
	}
	
}
