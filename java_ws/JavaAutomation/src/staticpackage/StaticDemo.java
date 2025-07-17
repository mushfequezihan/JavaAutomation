package staticpackage;

public class StaticDemo {

	public static void main(String[] args) {

		// not static method
		// objects getting variable and method which are static based on class
		StaticExampleClass s1 = new StaticExampleClass("bmw");
		System.out.println("Make of car is: " + s1.getMake());
		System.out.println("This is NON STATIC instance no: " + s1.getInstanceNum());
		System.out.println("This is static instance no: " + StaticExampleClass.getStaticInstanceNum());

		StaticExampleClass s2 = new StaticExampleClass("benz");
		System.out.println("Make of car is: " + s2.getMake());
		System.out.println("This is NON STATIC instance no: " + s2.getInstanceNum());
		System.out.println("This is static instance no: " + StaticExampleClass.getStaticInstanceNum());
		
		System.out.println("");

		// objects getting variable and method which are static based on class
		StaticExampleClass s3 = new StaticExampleClass("bmw");
		System.out.println("Make of car is: " + s3.getMake());
		System.out.println("This is static instance no: " + StaticExampleClass.getStaticInstanceNum());
		System.out.println("Wheel no: " + StaticExampleClass.getWheel());

		StaticExampleClass s4 = new StaticExampleClass("benz");
		System.out.println("Make of car is: " + s4.getMake());
		System.out.println("This is static instance no: " + StaticExampleClass.getStaticInstanceNum());
		System.out.println("Wheel no: " + StaticExampleClass.getWheel());
	}
}
