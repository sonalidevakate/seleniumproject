package Status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EnableLoginButton {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();  
	driver.get("https:\\www.facebook.com/");  
	boolean b1=driver.findElement(By.xpath("//button[@name=\"login\"]")).isDisplayed(); //o/p:-true->login button display
	System.out.println(b1);
	boolean b2=driver.findElement(By.xpath("//button[@name=\"login\"]")).isEnabled(); //o/p:-true->login button Enable
	System.out.println(b2);
	
}
}

