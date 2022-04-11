package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumConfiguration.Configuration;

public class Explicitwait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		 WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		 
		 WebDriverWait wait = new WebDriverWait(driver, 5);   // Explicit wait
		 
		 wait.until(ExpectedConditions.visibilityOf(userName));
		 
		 userName.sendKeys("anshika");
		 
		 WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		 
		 wait.until(ExpectedConditions.visibilityOf(password));
		 
		 password.sendKeys("12345");
		
		// driver.close();
		
	}
	}



