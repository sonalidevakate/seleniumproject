package AutomateCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		Thread.sleep(500);
		//String flag="False";
		//while(flag=="False") {
		//if(driver.findElement(By.xpath("//div[@class=\"DayPicker-Day DayPicker-Day--selected\"][contain(@aria-label,'Thu Mar 17 2022')]"))
		driver.findElement(By.xpath("//div[@class=\"DayPicker-Day DayPicker-Day--selected\"][contain(@aria-label,'Thu Mar 17 2022')]")).click();
		//flag="True";
		
		{
			Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class=\"DayPicker-NavButton DayPicker-NavButton--next\"]")).click();
		}
	
	 driver.findElement(By.xpath("//div[@class=\"DayPicker-Day DayPicker-Day--end DayPicker-Day--selected\"][contain(@aria-label,'Thu Apr 17 2022')]")).click();
		
	

}
}
