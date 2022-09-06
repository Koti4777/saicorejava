package seleniumpackage1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	FileUtils.copyFile(scrfile, new File("C:\\Users\\ravit\\Dropbox\\Screenshots\\fullscreenshort.jpg"));
		
		File smallfile=driver.findElement(By.xpath("//table[@id='product']/tbody/tr[2]")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(smallfile, new File("C:\\Users\\ravit\\Dropbox\\Screenshots\\offscreenshort.jpg"));
		
	}

}
