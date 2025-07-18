package oopautomobile;

public class VehicleBMW extends Vehicle{

	//constructor invoking Vehicle constructor
	public VehicleBMW(int speed) {
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
