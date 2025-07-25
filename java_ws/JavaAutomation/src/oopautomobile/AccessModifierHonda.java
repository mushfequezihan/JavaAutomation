package oopautomobile;

public class AccessModifierHonda extends AccessModifierCar{

	public void accessCarforHonda() {
		
		//access all from Car Access Modifier 
		AccessModifierCar cam = new AccessModifierCar();
		cam.noModifierSpeed = 10;
		cam.setPrivateoilChange(10);
		protectedCarWheel = 10;
	}
}
