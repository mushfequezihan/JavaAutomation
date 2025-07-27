package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	// example for linked list same as array list
	public static void main(String[] args) {

		// when data set is small its same as array list
		LinkedList<String> cars = new LinkedList<String>();

		// adding
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");

		// size
		int size = cars.size();
		System.out.println("Linked list size: " + size);

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

		/*
		 * Array List - {0,3,4,5,5,2,1} - takes more memory and space and time liked
		 * list - [0] > [2} > [5] - its a reference type faster < < array list - use
		 * when you have to add at the end and remove from the end and get it fast
		 * linked list - use when you have to add at beginning and remove from the
		 * beginning
		 */

		// use same list interface use array or linked list
		List<Integer> lList = new LinkedList<Integer>();
		List<Integer> aList = new ArrayList<Integer>();

		// add item in different index
		System.out.println("");
		aList.add(10);
		aList.add(5);
		System.out.println("array list size: " + aList.size() + " array list item: " + aList);

		aList.add(1, 15);
		System.out.println("after index change: " + aList.size() + " array list item: " + aList);
		System.out.println("");

		// to test linked list vs array list
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> arrayList = new ArrayList<Integer>();

		// calling method to check duration how long does it take to ADD OR REMOVE ITEM
		// in list
		runDurationForAddRemoveItem(arrayList, "Array List");
		System.out.println("");
		runDurationForAddRemoveItem(linkedList, "Linked List");
	}

	// another method for linked list vs array list to check run time of both
	public static void runDurationForAddRemoveItem(List<Integer> list, String listType) {

		System.out.println("Duration method for: " + listType);
		long startTime = System.currentTimeMillis();

		// to add list of item to test the method at the End of list
		for (int i = 0; i < 100000; i++) {
			list.add(i); // add at the end Array list faster***
		}

		long endtimetoEndoflistAdd = System.currentTimeMillis();
		long endoflistAddDuration = endtimetoEndoflistAdd - startTime;
		System.out.println("time to add at END of list is: " + endoflistAddDuration + " ms");

		// adding more item in the list at the Beginning of index
		int size = list.size();
		int elementToAdd = size + 100000;

		for (int i = size; i < elementToAdd; i++) {
			list.add(0, i); // add at the Beginning linked list faster***
		}

		long endtimeBeginoflistAdd = System.currentTimeMillis();
		long beginoflistAddDuration = endtimeBeginoflistAdd - startTime;
		System.out.println("time to add at BEGIN of list is: " + beginoflistAddDuration + " ms");

		// to Remove list of item to test the method at the End of list
		for (int i = 90000; i < 92000; i++) { // almost close to end of list
			list.remove(i); // add at the end Array list faster***
		}

		long endtimeEndoflistRemove = System.currentTimeMillis();
		long endoflistRemoveDuration = endtimeEndoflistRemove - startTime;
		System.out.println("time to Remove at END of list is: " + endoflistRemoveDuration + " ms");

		// to Remove list of item to test the method at the Begin of list
		for (int i = 0; i < 100; i++) { 
			list.remove(i); // add at the Begin linked list faster***
		}

		long endtimeBeginoflistRemove = System.currentTimeMillis();
		long beginoflistRemoveDuration = endtimeBeginoflistRemove - startTime;
		System.out.println("time to Remove at BEGIN of list is: " + beginoflistRemoveDuration + " ms");
	}
}
