package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting use driver is ref var.
		driver.get("https:\\www.facebook.com/");  //element or function in browser
		
		//xpathbyAttribute
		/*driver.findElement(By.xpath("//input[contains(text(),'email']")).sendKeys("Sonali@12");
		driver.findElement(By.xpath("//input[contains(text(),'pass']")).sendKeys("123987");
		driver.findElement(By.xpath("//button[contains(text(),'login']")).click();
		Thread.sleep(5000);/*
		
		//xpathbyText
		/*driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//a[text()='Messenger']")).click();
		driver.findElement(By.xpath("//a[text()='Marketplace']")).click();
		Thread.sleep(5000);*/

		
		//xpathbyContains
		driver.findElement(By.xpath("//a[contains(text(),'Forg')]")).click(); //xpathby contains
		driver.findElement(By.xpath("//a[contains(text(),'Messeg')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();

	}

}
