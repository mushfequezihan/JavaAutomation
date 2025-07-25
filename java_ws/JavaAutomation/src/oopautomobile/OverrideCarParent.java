package oopautomobile;

public class OverrideCarParent {

	public void engineStart(int cyl) {

		System.out.println("I am from Parent Class");
	}

	//override and load
	public void engineStart(int cyl, int sup) {

		System.out.println("I am SUP from Parent Class");
	}
	
	//private static and final method cannot be override as they are local to class
	public static void increaseSpeed() {

		System.out.println("Increasing SPEED");
	}

}
