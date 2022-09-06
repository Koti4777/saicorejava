package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouiceaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		
		
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/");

		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@data-nav-role='signin']"))).build().perform();
		
		WebElement men=driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']"));
		
		action.click(men).build().perform();
		
		
		

	}

}
