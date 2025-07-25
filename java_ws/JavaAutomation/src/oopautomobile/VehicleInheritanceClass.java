package oopautomobile;

public class VehicleInheritanceClass {

	public static void main(String[] args) {

		int speed = 0;
		
		//different object class and inherited methods
		System.out.println("From Vehicle class:");
		VehicleInherit v1 = new VehicleInherit(speed);
		v1.increaseSpeed();
		
		System.out.println("");
		System.out.println("From BMW class including Vehicle:");
		VehicleInheritBMW vb1 = new VehicleInheritBMW(speed);
		vb1.increaseSpeed();
		vb1.headupDisplayNav();
	}

}
