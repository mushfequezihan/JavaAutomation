package Test;

public class Strings {

	public static void main(String[] args) {

		// string literal - string constant pool
		String str1 = "my name is zihan";
		System.out.println(str1);
		
		// create same value with different reference good for memory utilization
		String str3 = "my name is zihan";
		System.out.println(str3);
		
		// string Object - heap memory
		String str2 = new String("Welcome to code");
		System.out.println(str2);
		
		// creates new object with reference creates space/memory issue 
		String str4 = new String("Welcome to code");
		System.out.println(str4);
		
		//Strings are immutable
		str1 = "name changed!";
		System.out.println(str1);
		
		String str5 = str1 + str2;
		System.out.println(str5);
	}

}
