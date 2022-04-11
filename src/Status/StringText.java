package Status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https:\\www.facebook.com/");  
		String text=driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getText(); 
		System.out.println(text);
		//o/p:-Facebook helps you connect and share with the people in your life.

}
}
