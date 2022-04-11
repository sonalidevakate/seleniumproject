package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting use driver is ref var.
		
		driver.get("https:\\www.facebook.com/");
		Thread.sleep(2000);  //timer or delay
		driver.manage().window().maximize();		
		Thread.sleep(5000);  //timer or delay
		driver.manage().window().minimize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);

	}
}
