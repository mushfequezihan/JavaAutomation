package oopautomobile;

public class CarMainClass {

	public static void main(String[] args) {
		
		// create and initialize an object from class Car
		Car car = new Car();
		car.increasesSpped();
		
		//accessing setter and getters
		car.setMake("BMW");
		System.out.println(car.getMake());
		System.out.println("");
		
		//model is not assigned getting default value
		System.out.println("model of BMW: " + car.getModel());
		System.out.println("");
		
		Car car1 = new Car();
		car1.setMake("M-Benz");
		System.out.println("car make: " + car1.getMake());
		
		car1.setModel("Benz-300");
		System.out.println("model: " + car1.getModel());
		
		//select year from 2010 as validation in Car class
		car1.setYear(2000);
		System.out.println("year: " + car1.getYear());
		System.out.println("");
		
		//constructor example
		Car c1 = new Car();
		c1.setMake("Honda");
		System.out.println("car make: " + c1.getMake());
		System.out.println("speed: " + c1.getSpeed());
		System.out.println("gear: " + c1.getGear());
		System.out.println("");
		
		Car c2 = new Car(10, 1);
		c2.setMake("tesla");
		System.out.println("car make: " + c2.getMake());
		System.out.println("speed: " + c2.getSpeed());
		System.out.println("gear: " + c2.getGear());
		System.out.println("");
		

	}

}
