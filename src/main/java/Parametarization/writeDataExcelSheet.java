package Parametarization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataExcelSheet {
	
	public void writedata(String namereceive) throws IOException {
		
		 String filePath = "C:\\Users\\ADMIN\\OneDrive\\Documents\\writedataformselenium.xlsx";
		
		FileInputStream file = new FileInputStream(filePath);
	
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet =wb.getSheetAt(0);
		
		//write data
		
		sheet.getRow(1).getCell(1).setCellValue(filePath);
		FileOutputStream fos= new FileOutputStream(filePath);
		wb.write(fos);
		wb.close();
	}
	
	 public static void main(String[] args) throws IOException {
		 
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter your data");
		 String name= sc.next();
		 writeDataExcelSheet writer = new writeDataExcelSheet();
	       
		 writer.writedata(name);
	    }
	
	
	}
	
	


