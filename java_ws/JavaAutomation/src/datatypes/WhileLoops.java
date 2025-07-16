package datatypes;

public class WhileLoops {

	public static void main(String[] args) {

		int i = 10;
		
		while ( i < 20 ) {
			
			i++;	
			
			if ( i == 17 ) {
				continue;
			}
			System.out.println("Value of i: " +i);
			 
		}
		
		System.out.println("Outside while loop ...");
		System.out.println();
		
		System.out.println("do while loop:");
		
		int j = 10;
		
		do {
			System.out.println(j);
			j++;
		} while (j < 20);
	}

}
