package seleniumpackage1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class excelreadlogic {
	FileInputStream fis;
	XSSFWorkbook book;
	XSSFSheet sheet;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		excelreadlogic exe=new excelreadlogic();	
		String firstname=(exe.excelread(0,1));
		String lastname=(exe.excelread(1,1));
		String emailid=(exe.excelread(2,1));
		String password=(exe.excelread(3,1));
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("email")).sendKeys(emailid);
		driver.findElement(By.name("password")).sendKeys(password);
		//driver.findElement(By.xpath("//a[@class=\"list-group-item\"][3]")).click();
		
	}


    public String excelread(int rownum,int cellnum) throws IOException {
    	fis=new FileInputStream("C:\\Users\\ravit\\Downloads\\test.xlsx");
		 book= new XSSFWorkbook(fis);
		sheet=book.getSheet("Sheet2");
		String data=sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
		
    	
    }}