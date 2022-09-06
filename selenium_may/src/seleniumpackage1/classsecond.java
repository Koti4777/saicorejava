package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class classsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		
		
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");

		driver.manage().window().minimize();
	
		
	//	driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']")).click();
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(998981);
		
		
	}

}

