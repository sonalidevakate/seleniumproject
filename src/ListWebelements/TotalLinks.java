package ListWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> xyz=driver.findElements(By.xpath("//a"));
		int a=xyz.size();
		System.out.println(a);
		for(int i=0;i<=a-1;i++) {
			System.out.println(xyz.get(i).getText());

			
		}
}
}
