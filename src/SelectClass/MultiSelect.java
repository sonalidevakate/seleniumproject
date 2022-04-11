package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https:\\www.facebook.com/signup");  
		driver.manage().window().maximize();
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]")); //dropdown
		Select s=new Select(year);
		boolean result=s.isMultiple();
		System.out.println(result);
		driver.quit();
		
}
}
