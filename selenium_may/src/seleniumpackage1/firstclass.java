package seleniumpackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Pomegranate");
		
		driver.manage().window().maximize();
		
		
		String pageTitle=driver.getTitle();
		
		System.out.println("this is web page"+pageTitle);
		
		driver.navigate().to("https://www.google.co.in/");
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	//	System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		
		//driver.close();
		//driver.quit();

		
		
	}

}

