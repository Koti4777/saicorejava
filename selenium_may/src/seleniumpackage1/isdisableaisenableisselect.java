package seleniumpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class isdisableaisenableisselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	
		driver.get("https://courses.letskodeit.com/practice");

		driver.manage().window().maximize();
		//is displayed
		System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		
		
		driver.findElement(By.id("hide-textbox")).click();
		
		Boolean displaystatus=driver.findElement(By.id("displayed-text")).isDisplayed();
		System.out.println(displaystatus);
		//is enabled
		System.out.println(driver.findElement(By.id("enabled-example-input")).isEnabled());

	driver.findElement(By.xpath("//input[@id='disabled-button']")).click();
	
	
	System.out.println(driver.findElement(By.id("enabled-example-input")).isEnabled());
	
	//is selected
	
	//driver.findElement(By.id("benzcheck")).click();

	System.out.println(driver.findElement(By.id("benzcheck")).isSelected());
	//get cssselector
	
	System.out.println(driver.findElement(By.id("openwindow")).getCssValue("font-size"));
	//get attribute
	System.out.println(driver.findElement(By.id("openwindow")).getAttribute("class"));
	
	}

}
