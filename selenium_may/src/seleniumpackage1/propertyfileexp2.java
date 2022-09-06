package seleniumpackage1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class propertyfileexp2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\ravit\\eclipse-workspace\\selenium_may\\src\\seleniumpackage1\\conf.programfile");
		Properties prob=new Properties();
		prob.load(fis);
	   String url=	prob.getProperty("appurl");
	   String username= prob.getProperty("username");
	   String password= prob.getProperty("pessword");
	   
		System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();

		driver.get(url);
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

}
