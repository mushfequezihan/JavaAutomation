package oopautomobile;

public class InterfaceTestDemo {

	public static void main(String[] args) {

		/*
		 * way to create object through class interface implementation
		 * can be created as well -> InterfaceCarDemo test = new InterfaceCarDemo();
		 */
		InterfaceCars myInterface = (InterfaceCars) new InterfaceCarDemo();
		myInterface.engineStart("6 cyl", false);
		
	}

}
