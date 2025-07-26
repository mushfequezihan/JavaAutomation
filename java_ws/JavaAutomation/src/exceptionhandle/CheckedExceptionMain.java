package exceptionhandle;

import java.sql.SQLException;

//checked exception
public class CheckedExceptionMain {

	public static void main(String[] args) {

		CheckedAccount ca = new CheckedAccount();
		
		//catch is not mandatory for try for try you need either catch or finally or both
		try {
			System.out.println("Before withdraw");
			ca.withdraw(100);
			System.out.println("After withdraw");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Try again some other time");
		}
		finally {
			System.out.println("Finally Key always executes");
		}
	}

}
