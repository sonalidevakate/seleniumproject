package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumConfiguration.Configuration;

public class HiddenWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://findnerd.com/list/view/Handling-Pop-ups-in-Web-Driver/6326/");
		WebElement cs=driver.findElement(By.xpath("//div[@title=\"Close\"]"));
		wait(driver,cs,40);
		cs.click();
	
}
	private static void wait(WebDriver driver, WebElement webElement, int i) 
	{
	 new WebDriverWait(driver, Duration.ofSeconds(i)).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(webElement));
	}
}

