package TestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;

public class BaseClass {
public  WebDriver driverInit() {
		
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver=new ChromeDriver();
		
		return driver;
		}


}
