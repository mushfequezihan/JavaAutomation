package datatypes;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {
		
		// fixed array size with and without allocation
		int[] intArray;
		intArray = new int[10];
		
		intArray[0] = 100;
		intArray[1] = 90;
		
		System.out.println("int Array 0 index: " + intArray[0]);
		System.out.println("int Array 1 index: " + intArray[1]);
		System.out.println("int Array 2 index: " + intArray[2]); // default assigned value
		System.out.println("");
		
		// one liner array allocation
		String[] strArray = {"bmw", "benz", "audi"};
		System.out.println("String Array 0 index: " + strArray[0]);
		System.out.println("String Array 1 index: " + strArray[1]);
		System.out.println("String Array 2 index: " + strArray[2]);
		System.out.println("");
		
		// fixed array size with allocation
		int[] intArray1 = {99,11};
		System.out.println("int Array 0 index: " + intArray1[0]);
		System.out.println("int Array 1 index: " + intArray1[1]);
		System.out.println("");
		
		// length of arrays
		int len1 = intArray.length;
		int len2 = intArray1.length;
		int len3 = strArray.length;
		System.out.println("int array length: " + len1);
		System.out.println("2nd int array length: " + len2);
		System.out.println("string array length: " + len3);
		System.out.println("");
		
		// sorting in array
		for (int i = 0; i < len1; i++) {
			System.out.println("before Array sort func: " + intArray[i]);
		}
		
		Arrays.sort(intArray);									// array sort function
		for (int i = 0; i < len1; i++) {
			System.out.println("after sort: " + intArray[i]);
		}
		System.out.println("");
		
		/*
		 * Array Copy function 2 elements starting from index 1 of strArray 
		 * into copy starting at index 0
		 */
		String[] copy = new String[2];
		System.arraycopy(strArray, 1, copy, 0, 2);
		for (int i = 0; i < copy.length; i++) {
			System.out.println(" Array copy " + i + " = " + copy[i] );
		}
	}

}
