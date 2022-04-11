package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;

public class Hiddenpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='View Pop-up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Close']")).click();

}
}
