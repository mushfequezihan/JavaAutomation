package exceptionhandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//to read properties files in application
public class ReadingProperties {

	//throwing checked exception
	public static void main(String[] args) throws IOException  {
		
		//location
		String path = "/Users/mushfequezihan/Desktop/java_ws/JavaAutomation/java_ws/JavaAutomation/src/exceptionhandle/test.properties";

		//loads all values from properties file
		Properties prop = new Properties();
		
		//to read from location
		FileInputStream fs = new FileInputStream(path);
		
		//methods from properties object
		prop.load(fs);
		System.out.println("name: " + prop.getProperty("name"));
		System.out.println("course: " + prop.getProperty("course"));
	}

}
