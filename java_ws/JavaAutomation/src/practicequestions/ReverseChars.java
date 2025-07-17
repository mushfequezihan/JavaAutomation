package practicequestions;

import java.util.Scanner;

public class ReverseChars {

	public static void main(String[] args) {

		//to get user input for string
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		
		String originalString = sc.nextLine();
		
		//validation for string from user 
		while (originalString.isEmpty() || originalString == null) {
			
			System.out.println("Please enter a valid string, empty and null string are not accepted.");
			originalString = sc.nextLine();
		}
		
		//close the scanner
		sc.close();
		
		//creating object calling method
		ReverseChars output = new ReverseChars();
		String revChars = output.reverseChars(originalString);
		
		System.out.println("Reverse Char: " + revChars);
		
	}
	
	//method for reverse char
	private String reverseChars(String originalString) {
		
		String reverse = "";
		
		//loop over original string and find char to reverse
		for (int i = originalString.length() - 1; i >= 0; i--) {
			
			reverse = reverse + originalString.charAt(i);
		}
		
		return reverse;
	}

}
