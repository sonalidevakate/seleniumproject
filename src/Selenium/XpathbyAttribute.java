package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyAttribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\OneDrive\\Desktop\\Salenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting use driver is ref var.
		driver.get("https:\\www.facebook.com/");  //element or function in browser
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sonali12"); 
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@name='login']")).click();

}
}
