package classmethods;

/*
 * argument list: argument should be same for parent and child class method for override
 * access modifier: override method cannot be more restrictive
 * private static and final method cannot be override as they are local to class
 */

public class OverrideBMWChild extends OverrideCarParent {

	public static void main(String[] args) {

		OverrideBMWChild c1 = new OverrideBMWChild();
		c1.engineStart(2);		//override
		c1.engineStart(2, 2);	//overload and override
		
		//dynamic object and method
		System.out.println("");
		OverrideCarParent c2 = new OverrideCarParent();
		c2.engineStart(2);
		c2.engineStart(2, 2);
		
		System.out.println("");
		OverrideCarParent c3 = new OverrideBMWChild();
		c3.engineStart(2);
		c3.engineStart(2, 2);
	}

	//method override
	@Override
	public void engineStart(int cyl) {
		super.engineStart(2);
		System.out.println("I am from CHILD Class");
	}
	
	@Override
	public void engineStart(int cyl, int sup) {
		super.engineStart(2);
		System.out.println("I am SUP from CHILD Class");
	}
	
	//method name can be same but cannot be override due to static
	public static void increaseSpeed() {

		System.out.println("Increasing SPEED");
	}
}
