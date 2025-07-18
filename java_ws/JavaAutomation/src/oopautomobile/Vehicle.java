package oopautomobile;

//class
public class Vehicle {

	private int speed;
	
	//constructor
	public Vehicle(int speed) {

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
