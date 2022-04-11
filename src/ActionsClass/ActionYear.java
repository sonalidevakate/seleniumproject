package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionYear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https:\\www.facebook.com/signup");  
		
		WebElement year=driver.findElement(By.xpath("//select[@name=\"birthday_year\"]")); 
		Actions act=new Actions(driver);
		
		act.moveToElement(year).perform();

		//act.moveToElement(year).click().build().perform();
		act.click().perform();
		for(int i=0;i<=10;i++) {
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		for(int i=0;i<=20;i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}

}
}
