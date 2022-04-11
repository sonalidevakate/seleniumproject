package TestNGParameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import SeleniumConfiguration.Configuration;

public class Demo {
	
	@Test
	@Parameters("browserName")   //browserName= firefox & chrome
	
	public void tc01(String str) {
		
		if(str.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Geckodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.close();
			
		}else {
			System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			//driver.close();
		}
	
	}
}
