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

public class TakeScreenShots {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https:\\www.facebook.com/");  
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sonali"); 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		Date d=new Date();
		String s=d.toString();
		String str=s.replace(":", "_"); //replace colon to underscore
		
		File f=new File("C:\\Users\\Sonali\\OneDrive\\Documents\\ScreenShot\\image_"+str+".jpg"); //display date & time in img.
		FileHandler.copy(src,f);

}
}
