package AutomateCalendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;

public class Calendar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//button[@class=\"sc-jTzLTM bfMZDh\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"fl search-box date-box gtm-onwardCalendar\"]")).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[text()='20']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"fl search-box date-box gtm-returnCalendar\"]")).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//td[text()='30']")).click();
		
		List<WebElement> src=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']//li[1])"));
		int a=src.size();
		System.out.println(a);
		for(int i=0;i<=a-1;i++) {
			System.out.println(src.get(i).getText());

		}
		
		//driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai, Maharashtra, India");
		//driver.findElement(By.xpath("//button[@class=\"fl button\"]")).click();


}
}
