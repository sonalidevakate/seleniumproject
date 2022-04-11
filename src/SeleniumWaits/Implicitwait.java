package SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;

public class Implicitwait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);   //implicit wait
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sonali");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");

		
		//driver.close();
		
		
	}

}







