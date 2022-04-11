package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"ytd-searchbox-spt \"]")).sendKeys("sandeep maheshvari motivational speech");
		driver.findElement(By.xpath("//button[@class=\"style-scope ytd-searchbox\"]")).click();
	}

}
