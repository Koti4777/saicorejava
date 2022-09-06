package seleniumpackage1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xmlreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\ravit\\Downloads\\test.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		//String password=sheet.getRow(1).getCell(1).getStringCellValue();

		for (int i = 0; i < 9; i++) {
	
		for (int j = 0; j < 2; j++) {
		
	
			String data=sheet.getRow(i).getCell(j).getStringCellValue();
			
		System.out.println(data);
		}}
		
		//System.out.println(data);
		
		//System.out.println(username);
		//System.out.println(password);
		
		/*System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(username);*/
	
	}

}
