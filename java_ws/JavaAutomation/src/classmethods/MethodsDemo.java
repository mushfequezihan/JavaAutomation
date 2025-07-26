package classmethods;

public class MethodsDemo {

	public static void main(String[] args) {

		//main method call
		String a = "Hey there i am MAIN method";
		System.out.println(a);
		System.out.println("");
		
		newMethod(); //method call
		
		//calling method to find student grades and display
		findgrades("john", 89);
		findgrades("elma", 79.5);
		findgrades("ashely", 50.25);
		
		//degree method call 
		displayDegrees("robin", findDegrees(160)); 	//direct call method inside method
		
		//variables not hardcoded
		String name;
		String grade; 
		
		name = "Tom";
		grade = findDegrees(125); 
		displayDegrees(name, grade);
		
		grade = findDegrees(70); 
		displayDegrees("olga", grade);
	}
	
	public static void newMethod() {
		String a = "I am New Method";
		System.out.println(a);
		System.out.println("");
	}
	
	//methods to find students Grades
	public static void findgrades(String studentname, double scores) {
		
		String grade;
		
		if (scores >= 90 && scores <= 100) {
			grade = "A";
		} else if (scores >= 80 && scores < 90) {
			grade = "B";
		} else if (scores >= 70 && scores < 80) {
			grade = "C";
		} else {
			grade = "D";
		}
		
		System.out.println("Grade of " + studentname + " with score " + scores + " is: " + grade);
	}
	
	//return type method
	public static String findDegrees(int credits) {
		
		String degree;
		
		if (credits >= 120 && credits <= 130) {
			degree = "Bachelor";
		} else if (credits >= 150 && credits <= 165) {
			degree = "Masters";
		} else {
			degree = "In Progress";
		}
		return degree;
		
	}

	//display degree method
	public static void displayDegrees(String name, String degree) {
		System.out.println("");
		System.out.println("************************************");
		System.out.println("Student: " + name + "\nDegree: " + degree);
		System.out.println("************************************");
	}
}
