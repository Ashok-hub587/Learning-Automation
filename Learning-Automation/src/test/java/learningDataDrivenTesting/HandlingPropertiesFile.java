package learningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class HandlingPropertiesFile {

	@Test(enabled = true)
	public void readData() throws IOException {

		// 1.Covert physica file into java understandable
		FileInputStream fis = new FileInputStream("./src/test/resources/Commondata.properties");

		// 2.Create instance for Properties class
		Properties propertyObj = new Properties();

		// 3.Load the properties
		propertyObj.load(fis);

		// 4.Fetch the data
		String data1 = propertyObj.getProperty("url");
		String data2 = propertyObj.getProperty("username");
		String data3 = propertyObj.getProperty("password");
		String data4 = propertyObj.getProperty("myname");

		// Print The data
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);

		System.out.println("Data fetch form Properties file success...!!");
	}

	@Test(enabled = false)
	public void writeData() throws IOException {

		// 1.Covert physica file into java understandable
		FileInputStream fis = new FileInputStream("./src/test/resources/Commondata.properties");

		// 2.Create instance for Properties class
		Properties propertyObj = new Properties();

		// 3.Load the properties
		propertyObj.load(fis);

		//4.Write new data
		propertyObj.put("myname", "ashok");
		
		//5.Convert java file to physiscal 
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Commondata.properties");
		
		//6.Store data
		propertyObj.store(fos, "New data Added Successfully");
		
		
		System.out.println("Data writing into properties file success..!!");
	}
}
