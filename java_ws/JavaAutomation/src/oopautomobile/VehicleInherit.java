package oopautomobile;

//class
public class VehicleInherit {

	private int speed;
	
	//constructor
	public VehicleInherit(int speed) {

		this.speed = speed;
	}

	//user methods
	public void increaseSpeed() {

		speed++;
		System.out.println("Increasing Vehicle SPEED ++");
	}

	public void decreaseSpeed() {

		speed--;
		System.out.println("Decreasing Vehicle SPEED --");
	}
}
