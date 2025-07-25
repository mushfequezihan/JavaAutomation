package oopautomobile;

public class Car extends AccessModifierCar {
	
	private String color;
	private String make;
	private String model;
	private int year;
	private int speed;
	private int gear;

	// default/assigned constructor
	public Car() {
		this(60, 4); // constructor call within constructor - coming from below parameter 
		this.speed = speed;
		this.gear = gear;
		System.out.println("constructor Without arguments");
	}

	public Car(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("constructor WITH arguments");
	}

	// custom method
	public void increasesSpped() {
		System.out.println("Increasing the SPEED!");
		
		//protect modifier variable method from that class
		protectedCarWheel++;
		AccessModifierCar cam = new AccessModifierCar();
		cam.setProtectedCarWheel(10);
				
	}

	// setters and getters
	public String getColor() {
		return color;
	}

	// this keyword reference to class variable
	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {

		// adding validation
		if (year > 2010) {
			this.year = year;
		} else {
			System.out.println("not valid - Select newer years!");
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

}
