package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop { 
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();  
	driver.get("https:\\www.globalsqa.com/demo-site/draganddrop");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.switchTo().frame(3);
	driver.switchTo().parentFrame();
	driver.switchTo().frame(3);


	WebElement src = driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
	Thread.sleep(2000);

	WebElement src1 = driver.findElement(By.xpath("//img[@alt=\"Planning the ascent\"]"));
	WebElement dest = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
	Actions ac=new Actions(driver);
	ac.dragAndDrop(src, dest).perform();
	ac.dragAndDrop(src1, dest).perform();



}
}
