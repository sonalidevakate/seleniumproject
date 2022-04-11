package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\OneDrive\\Desktop\\Salenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting use driver is ref var.
		
		driver.get("https:\\www.selenium.dev/downloads/");  //element or function in browser
		
		Dimension d=new Dimension(250,550);  //psarameterized constructor
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p=new Point(200,200);
		driver.manage().window().setPosition(p);
		

}
}
