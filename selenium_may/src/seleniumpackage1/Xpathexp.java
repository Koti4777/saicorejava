package seleniumpackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpathexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		//driver.findElement(By.id("benzcheck")).click();
		
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//input[@id='hondaradio']")).click();
		
		driver.findElement(By.xpath("//input[@id='benzcheck']")).click();
		//input[@id='name']
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("ramu");
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).clear();
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("lakshmi");
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();	*/
		
		//Select select=new Select(driver.findElement(By.xpath("//select[@name='cars']")));
		
		//select.selectByIndex(1);
		
		//select.selectByVisibleText("Honda");
		
		driver.switchTo().frame("courses-iframe");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Course']")).sendKeys("selenium");
	
		
	
		}
		
		
	}


