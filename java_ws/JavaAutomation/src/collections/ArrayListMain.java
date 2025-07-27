package collections;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {

		// limit size is 100 - if exceeded over 100 takes lot of memory issues
		ArrayList<String> cars = new ArrayList<String>(100);

		// adding
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");

		// size
		int size = cars.size();
		System.out.println("Array list size: " + size);

		// get
		System.out.println("item on index 1 is: " + cars.get(1));

		// iteration
		System.out.println("");
		System.out.println("Iteration example:");
		for (int i = 0; i < size; i++) {
			System.out.println("item on index " + i + " is " + cars.get(i));
		}

		System.out.println("");
		System.out.println("next for loop example:");
		for (String string : cars) {
			System.out.println("item is: " + string);
		}

		// remove
		System.out.println("");
		cars.remove(size - 1);

		// to remove array list is not recommended for memory consumption
		System.out.println("next for loop example after remove:");
		for (String string : cars) {
			System.out.println("item is: " + string);
		}
	}

}
