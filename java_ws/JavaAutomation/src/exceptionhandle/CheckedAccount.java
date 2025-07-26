package exceptionhandle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedAccount {
	
	//DB connection to get an checked exception
	public Connection getCon() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/";
		String user = "admin";
		String pass = "code";
		
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, pass);
		
		return conn;
	}

	//throws an exception 
	public void withdraw(int amount) throws SQLException {
		
		getCon();
	}
}
