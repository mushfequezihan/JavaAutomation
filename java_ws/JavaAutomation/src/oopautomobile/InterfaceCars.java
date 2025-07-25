package oopautomobile;

/*
 * reference type in java contains all abstract method
 * any class can implement a interface which a contract to implement all methods 
 * java does not have multiple inheritance but implement multiple interfaces
 */
public interface InterfaceCars {

	/*
	 * variable in interface is NOT best practice Keep them only in class
	 * variable can not be private in interface
	 * constant variable can be defined if needed in interface
	 */
	public String speed = "100";
	
	//abstract method
	public void engineStart(String enginetype, boolean keyLess);
}
