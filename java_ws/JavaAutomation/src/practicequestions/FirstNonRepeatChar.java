package practicequestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatChar {

	public static void main(String[] args) {

		// Return a char in string which is not repeated and if no char is repeating
		// return _
		System.out.println("First NON repeating Char is with loop: " + nonRepeatingLoop("abacabad"));
		System.out.println("First NON repeating Char is with Hashmap: " + nonRepeatingHashmap("abacabadcd"));
		System.out.println("First NON repeating Char is with Ternary: " + nonRepeatingTernary("abacabad"));
		
	}

	// first solution with for loop and built in method
	private static char nonRepeatingLoop(String string) {

		for (int i = 0; i < string.length(); i++) {

			// for string compare every char with last char
			if (string.indexOf(string.charAt(i)) == string.lastIndexOf(string.charAt(i))) {

				return string.charAt(i);
			}
		}

		return '_';
	}

	// 2nd solution with hash map using for loop
	// but not with nested for loop so its faster and better
	private static char nonRepeatingHashmap(String string) {

		// HashMap -> Key/Value Pair
		Map<Character, Integer> countmap = new HashMap<Character, Integer>();

		// to check if char is repeating add key value pair with that
		for (int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);

			if (countmap.containsKey(c)) {
				countmap.put(c, countmap.get(c) + 1);
			} else {
				countmap.put(c, 1);
			}
		}

		// if not any char repeating then return the char
		for (int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);

			if (countmap.get(c) == 1) {
				return c;
			}
		}

		return '_';
	}

	// if we want to use less code and in the method using ternary operator and remove if else
	// to the 2nd solution below is better with less line of code
	private static char nonRepeatingTernary(String string) {

		// HashMap -> Key/Value Pair
		Map<Character, Integer> countmap = new HashMap<Character, Integer>();

		// to check if char is repeating add key value pair with that
		for (int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);

			Integer charCount = countmap.get(c);
			
			//Ternary operator instead of if else statement 
			countmap.put(c, charCount == null ? 1 : charCount + 1); 
		}

		// if not any char repeating then return the char
		for (int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);

			if (countmap.get(c) == 1) {
				return c;
			}
		}

		return '_';
	}

}
