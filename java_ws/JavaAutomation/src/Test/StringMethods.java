package Test;

import java.util.Iterator;

public class StringMethods {

	public static void main(String[] args) {

		String str = "My name is";
		
		String str1 = "Animal";
		String str2 = "Animal";
		String str3 = "Human";
		
		String str4 = "";
		String str5 = "        Blank spaces around   ";
		String str6 = "Marvel";
		
		
		System.out.println("length: " + str.length()); 				// length of string
		System.out.println("char: " + str.charAt(3));				// returns char value of index
		System.out.println("concat: " + str.concat(" - zihan"));		// combines strings
		System.out.println("");
		
		// returns true if char exits in string
		System.out.println("contains: " + str.contains("is"));
		System.out.println(str.contains("zihan"));
		System.out.println("");
		
		//checks if string starts with prefix
		System.out.println("starts with: " + str.startsWith("My"));
		System.out.println(str.startsWith("is"));
		System.out.println("");
		
		// checks if string ends with suffix
		System.out.println("ends with: " + str.endsWith("is"));
		System.out.println(str.endsWith("name"));
		System.out.println("");
		
		//compares contents of 2 strings
		System.out.println("equals: " + str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println("");
		
		// returns index of char or substring
		System.out.println("index of: " + str.indexOf('n'));
		System.out.println(str.indexOf('o'));
		System.out.println("");
		
		// checks if the string is empty 
		System.out.println("is empty: " + str.isEmpty());
		System.out.println(str4.isEmpty());
		System.out.println("");
		
		// eliminates leading and trailing spaces
		System.out.println("trim: " + str5);
		System.out.println(str5.trim());
		System.out.println("");
		
		// returns string replacing old char to new char
		System.out.println("replace: " + str6);
		System.out.println(str6.replace('v', 'd'));
		System.out.println("");
		
		//returns part of the string
		System.out.println("substring begin index imclusive: " + str.substring(3));
		System.out.println("substring begin and end index exclusive: " + str.substring(0, 7));
		System.out.println("");
		
		//converts the string into char array
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("index " + i + " char Array is: " + charArray[i]);
		}
		System.out.println("");
		
		//return the case in lower/upper case letter
		System.out.println("Lower Case: " + str.toLowerCase());
		System.out.println("Upper Case: " + str.toUpperCase());
		System.out.println("");
		
	}

}
