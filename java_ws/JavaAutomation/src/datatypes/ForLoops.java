package datatypes;

import java.util.Iterator;

public class ForLoops {

	public static void main(String[] args) {

		//basic for loop idea
		for (int i = 0; i < 10; i++) {

			System.out.println("Value of i: " + i);
		}
		
		System.out.println("");
		
		//array iterate through loop
		int[] numbers = {10,20,30};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value of index " + i + " is: " + numbers[i]);
		}
		
		System.out.println("");
		
		//for each enhanced loop
		for (int i : numbers) {
			System.out.println("Value from foreach loop: " + i);
		}
		
		System.out.println("");
		System.out.println("List of cars from Array:");
		
		//example
		String[] cars = {"bmw", "audi", "honda"};
		for (String string : cars) {
			System.out.println(string);
		}
	}

}
