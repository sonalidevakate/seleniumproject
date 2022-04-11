package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https:\\www.facebook.com/signup/"); 
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("sonali");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("devakate");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("sonali12@gmail.com");
		driver.findElement(By.xpath("//input[@value='1']")).click(); //pathbyindex
		


	}
}
	