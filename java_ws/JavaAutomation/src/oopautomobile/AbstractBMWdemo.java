package oopautomobile;

//to use abstract class 
public class AbstractBMWdemo extends AbstractCars{

	//must include constructor if parent class has it
	public AbstractBMWdemo(int absSpeed) {
		super(absSpeed);
	}

	//inheriting from abstract class
	public void setSpeed(int speed) {
		
		super.setAbsSpeed(10);
	}
	
	//inherit and add custom method
	public void engine() {
		
		super.engineStart();
		System.out.println("More functionality from BMW including abstract Car");
	}
	

	/*
	 * any class which inherit Abstract class which has Abstract method 
	 * they have to implement that Abstract method with override 
	 */
	@Override
	public void carPerformance(String keyType, int numOfCyl) {

		System.out.println("Implemented from Abstract class as needed!");
	}
}
