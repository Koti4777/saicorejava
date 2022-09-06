package seleniumpackage1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xmlwrite {
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	xmlwrite write=new xmlwrite();
		
	exelwrite("raju",0,0,"raju");
	
	}



public static void exelwrite(String sheetname,int rownum,int cellnum,String text) throws IOException {
	
	FileOutputStream fis=new FileOutputStream("C:\\Users\\ravit\\Downloads\\abcd.xlsx");
	
	XSSFWorkbook book=new XSSFWorkbook();
	XSSFSheet sheet=book.createSheet(sheetname);
	
	XSSFRow row=sheet.createRow(rownum);
	row.createCell(cellnum).setCellValue(text);
	book.write(fis);
	
	 System.out.println("excel write completed");
	
}}
