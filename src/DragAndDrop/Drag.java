package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//li[@class=\"block14 ui-draggable\"]"));
		WebElement dest = driver.findElement(By.xpath("//div[@id=\"shoppingCart1\"]"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(src, dest).perform();

}
}
