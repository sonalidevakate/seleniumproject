package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSalenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriverSetup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting use driver is ref var.
		driver.get("https:\\www.facebook.com/");
		Thread.sleep(2000);  //timer or delay
		driver.manage().window().maximize();		
		Thread.sleep(5000);  //timer or delay
		driver.manage().window().minimize();

		driver.navigate().to("https:\\www.google.com/"); //without using get mthd url
		Thread.sleep(5000);  //timer or delay

		driver.manage().window().maximize(); //max browser
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);  //timer or delay
		driver.navigate().back(); //bakc to previous page
		Thread.sleep(5000);
		driver.navigate().forward(); //navigate to next page
		Thread.sleep(2000);
		driver.navigate().refresh(); //refresh current page
		Thread.sleep(2000);  //timer or delay

		driver.close();
		driver.quit();
		
	}

}
