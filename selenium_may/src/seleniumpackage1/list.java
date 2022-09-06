package seleniumpackage1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class list {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.tagName("a"));
		
     List<WebElement>alllinks=driver.findElements(By.tagName("a"));
     
     for (WebElement links : alllinks) {
    	 
    	 System.out.println(links.getText());
    	 
    	 List<WebElement>radioclick=driver.findElements(By.xpath("//input[@type='radio']"));
    	 
    	 for (WebElement rdclicks :radioclick ) {
    		 
    		 rdclicks.click();
   	 
    	//	 File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		// FileUtils.copyFile(scrfile, new File("C:\\Users\\ravit\\Dropbox\\Screenshots\\fullscreenshort.jpg"));
    		 
		}
		
	}
     
	}

}
