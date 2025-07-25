package oopautomobile;

public class OverloadingQuestion {

	public static void main(String[] args) {

		increaseHeight("2", 2);
	}

	private static void increaseHeight(String var1, int var2) {

		System.out.println("I am the 1st Overload");
	}
	
	//can not overload just on return type
	private static void increaseHeight(String var1, String var2) {

		System.out.println("I am the 2nd Overload");
	}

}
