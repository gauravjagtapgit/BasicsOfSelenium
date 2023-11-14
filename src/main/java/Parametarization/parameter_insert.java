package Parametarization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameter_insert {

	private static POIFSFileSystem inputStream;

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver2\\Chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	       
   Thread.sleep(2000);
	       
	        
	        
	           FileInputStream file = new  FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\paameter.xlsx");
	           
	         Workbook wb = WorkbookFactory.create(file);
	         Sheet sheet =wb.getSheet("Sheet1");
	         
	         for(int i=0;i<3;i++) {
	        	 
	     String data =sheet.getRow(i).getCell(0).getStringCellValue();
	     System.out.println(data);
	     
	     String data1 =sheet.getRow(i).getCell(1).getStringCellValue();
	     System.out.println(data1);
	        	 
	}
	       System.out.println( sheet.getRow(2).getCell(2).getStringCellValue()); 
	        
	       HSSFWorkbook wb1=new HSSFWorkbook(inputStream);
	     HSSFSheet sheet3 =     wb1.getSheet("Studeant_data");
	         
	         System.out.println(sheet3);
	         
	         
	         
	         
	         
	         
	         
//	         Row row =sheet.createRow(2);
//	         
//	         Cell cell =row.createCell(2);
//	         
//	         cell.setCellValue("Gaurav");
//	         
//	     FileOutputStream file1 =new  FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\paameter.xlsx");    
//	         
//	     wb.write(file1);
//	     file1.close();
	     
	        
	         
	}
}















