package Status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https:\\www.facebook.com/signup");  
		WebElement radiobtn=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));//.click(); //true
		boolean radio= radiobtn.isSelected();  //driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();//true
		radiobtn.click();
		Thread.sleep(5000);
		
		System.out.println(radio);
		
		

}
}
