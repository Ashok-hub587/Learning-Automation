package learningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class HandlingExcelFile {

	@Test(enabled = false)
	public void readData() throws IOException {

		// 1.Covert Physiscal file into java understandable
		FileInputStream fis = new FileInputStream("./src/test/resources/SeleniumBatch.xlsx");

		// 2.Create the workbook using workbook factory
		Workbook book = WorkbookFactory.create(fis);

		// 3.Fetch the data
		String data = book.getSheet("A10").getRow(1).getCell(0).getStringCellValue();
		System.out.println("Student Name is : " + data);

		// Get last row Number having Data
		int lastrowNum = book.getSheet("A10").getLastRowNum();
		System.out.println("Last Row number is " + lastrowNum);
		System.out.println();
		
		// 4. Read data ==> One Specific Column
		for (int i = 1; i <= lastrowNum; i++) {
			String data1 = book.getSheet("A10").getRow(i).getCell(0).getStringCellValue();
			System.out.println(data1);
		}
		System.out.println();
		
		//Fetch the last Cell Num
		int lastcellNum=book.getSheet("A10").getRow(1).getLastCellNum();
		System.out.println("Last Column Number in 1st row is :"+lastcellNum);//Cell Value Starts from 1
		System.out.println();
				
		//5. Fetch the data ====> One specific Row
		for (int i = 0; i < lastcellNum; i++) {
			String data2=book.getSheet("A10").getRow(1).getCell(i).getStringCellValue();
			System.out.print(data2+"  ");
		}
		System.out.println();
	}
	
	@Test
	public	void writeData() throws EncryptedDocumentException, IOException {
		//1.Convert Physical file into Java Understandable file
		FileInputStream fis=new FileInputStream("./src/test/resources/SeleniumBatch.xlsx");
		
		//2.Create workbook using Workbookfactory
		Workbook book=WorkbookFactory.create(fis);
		
		//3.Write data
		//book.createSheet("Automation").createRow(5).createCell(5).setCellValue("Learning Datadriven Testing");
		
		/*book.createSheet("PlacementBatch").createRow(1).createCell(0).setCellValue("Mohan Varma");
		book.getSheet("placementBatch").createRow(2).createCell(0).setCellValue("Ajay kumar");
		book.getSheet("placementBatch").createRow(3).createCell(0).setCellValue("Rohit");
		book.getSheet("placementBatch").createRow(4).createCell(0).setCellValue("Harsha");*/
		
		book.getSheet("PlacementBatch").getRow(1).createCell(1).setCellValue("9536412893");
		book.getSheet("placementBatch").getRow(2).createCell(1).setCellValue("8563489635");
		book.getSheet("placementBatch").getRow(3).createCell(1).setCellValue("7825963589");
		book.getSheet("placementBatch").getRow(4).createCell(1).setCellValue("5238948256");

		//4.Covert java file into physical file
		FileOutputStream fos=new FileOutputStream("./src/test/resources/SeleniumBatch.xlsx");
		
		//5.Write or save data
		book.write(fos);
		
		//6.Close Workbook
		book.close();
		
		System.out.println("Execution completed....!!!");
	}
}
