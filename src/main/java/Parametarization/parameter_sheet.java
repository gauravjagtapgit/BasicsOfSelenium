package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameter_sheet {

	
	
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver2\\chromedriver_win32 (6)\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	       
      Thread.sleep(2000);
	        
	        
	        
	           FileInputStream file = new  FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\data.xlsx");
	           
	         Workbook wb = WorkbookFactory.create(file);
	         Sheet sheet =wb.getSheet("Sheet1");
	         
	         for(int i=0;i<3;i++) {
	        	 
	     String data =sheet.getRow(i).getCell(0).getStringCellValue();
	     System.out.println(data);

	         }
	          
	         
	         
	         
	         
	         
	         
	         
	}

}


