package oopautomobile;

//multiple inheritance implementations
public class InterfaceCarDemo implements InterfaceCars, InterfaceBMW {

	//must implement interface methods from all
	@Override
	public void engineStart(String enginetype, boolean keyLess) {

		System.out.println("This is the implementation");
	}

	@Override
	public void headsUpNav() {

		System.out.println("This is from BMW interface");
	}

	
}
