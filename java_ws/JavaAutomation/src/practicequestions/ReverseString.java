package practicequestions;

public class ReverseString {

	public static void main(String[] args) {

		// original string to reverse
		String input = "this is a test string";

		// calling method
		String output = reverse(input);
		System.out.println("Reverse String:	" +output);
	}

	// reverse method
	private static String reverse(String input) {

		String reverse = "";

		// validation
		if (input.isEmpty() || input == null) {
			System.out.println("Empty and null string are not accepted");
		}

		// logic for reverse if for single word
		if (input.length() <= 1) {
			reverse = input;
		} else {

			// storing string to an array to loop through
			String[] originalArray = input.split("\\s+");

			for (String string : originalArray) { // this, is, a, test, string

				// this + "", is + this, a + is this, test + a is this, string + test a is this
				reverse = string + " " + reverse;
			}
		}

		// trim final output
		return reverse.trim();
	}

}
