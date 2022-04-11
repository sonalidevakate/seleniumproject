package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import SeleniumConfiguration.Configuration;
public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(Configuration.appUrlFLogin);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sonali12"); 
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String date=d.toString();
		String str=date.replace(":", "_"); //replace colon to underscore
		File f=new File(Configuration.screenshotpath+str+".jpg");
		FileHandler.copy(src, f);
		
	}
}
		
	


