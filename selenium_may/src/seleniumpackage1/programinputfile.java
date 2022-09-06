package seleniumpackage1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class programinputfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\ravit\\eclipse-workspace\\selenium_may\\src\\seleniumpackage1\\conf.programfile");
		Properties prob=new Properties();
		prob.load(fis);
		
	    String url=prob.getProperty("appurl");
	    String username=prob.getProperty("username");
	    String password=prob.getProperty("password");
	    
System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	
		driver.get(url);
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}
}
