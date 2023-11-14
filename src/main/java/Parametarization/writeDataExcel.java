package Parametarization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataExcel {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook workbook =new XSSFWorkbook();
		  
		XSSFSheet sheet = workbook.createSheet("Emp Info");
			
		Object empdata [][]= {  {"EmpId","Name","Job","Place","Company"},
			                   	{101,"David","Enginner","pune","apple"},
			                   	{102,"Smit","Manager","mumbai","microsowft"},
			                   	{103,"Scott","Analyst","dhili","netflixe"},
		                     };	
		// using for loop
		int rows = empdata.length;
		int cols = empdata[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for (int r=0; r<rows;r++) {
			
			XSSFRow row = sheet.createRow(r);
			
			for(int c=0; c<cols; c++ ) {
				
				XSSFCell cell = row.createCell(c);
				Object value = empdata[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			}
		}
		
		String filePath="C:\\Users\\ADMIN\\OneDrive\\Documents\\employee.xlsx";
		
	//	String filePath= ".\\datafiles\\employee.xlsx";
		FileOutputStream outstream =new FileOutputStream(filePath);
		workbook.write(outstream);
		
		outstream.close();
		
		System.out.println("Employee.xls file written successfully....");
	}

}


















