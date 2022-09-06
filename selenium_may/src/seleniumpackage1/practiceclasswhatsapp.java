package seleniumpackage1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practiceclasswhatsapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");

      driver.findElement(By.xpath("//img[@class='img-responsive offer-img']")).click();
      
      String parentwindowhandel=driver.getWindowHandle();
      System.out.println(parentwindowhandel);
      
      Set<String>windowhandels=driver.getWindowHandles();
      
      for (String window : windowhandels) {
		System.out.println(window);
	}
      
	}

}
