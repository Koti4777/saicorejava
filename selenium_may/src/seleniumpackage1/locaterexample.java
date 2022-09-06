package seleniumpackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locaterexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		/*driver.findElement(By.id("benzcheck")).click();
		
		
		driver.findElement(By.name("enter-name")).sendKeys("vinay");
		
		driver.findElement(By.className("course-name")).click();
		
		driver.quit();*/
		
		
	}

}
