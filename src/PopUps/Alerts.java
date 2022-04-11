package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;
public class Alerts {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
	Thread.sleep(2000);
	Alert alt=driver.switchTo().alert();
	alt.accept();
	//alt.dismiss();

	
	
}
}
