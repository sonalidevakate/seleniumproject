package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;

public class FrameName {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult"); //use name or id
	driver.findElement(By.xpath("//button[@type=\"button\"]")).click();

}
}
