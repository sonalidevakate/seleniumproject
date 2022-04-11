package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;

public class FacebookTestcase {
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		FacebookPom fp= new FacebookPom(driver);
		
		fp.enterUserName();
		Thread.sleep(2000);
		
		fp.enterPassword();
		fp.clickonLogin();
		
				
		
		
	}

}



