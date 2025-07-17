package staticpackage;

public class StaticExampleClass {

	private String make;
	private int instanceNum = 0;

	// static variable
	private static int staticInstanceNum = 0;
	private static int wheelsCount = 4;

	// constructor with static variable
	public StaticExampleClass(String make) {

		this.make = make;
		instanceNum++;
		
		staticInstanceNum++;
	}

	// getters
	public String getMake() {

		return make;
	}

	public int getInstanceNum() {

		return instanceNum;
	}

	// static methods
	public static int getStaticInstanceNum() {

		return staticInstanceNum;
	}

	public static int getWheel() {

		return wheelsCount;
	}
}
