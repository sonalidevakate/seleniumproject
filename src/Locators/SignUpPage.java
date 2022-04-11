package Locators;

import org.openqa.selenium.By; //By is a selenium class
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; //select is a selenium class

public class SignUpPage {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();  
			driver.get("https:\\www.facebook.com/signup");  
			driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("sonali");
			driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("devakate");
			driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("sonali12@gmail.com");
			WebElement confirm_email=driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")) ;
			confirm_email.sendKeys("sonali12@gmail.com");
			WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
			password.sendKeys("123459876");
			WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));  //drop down
			Select sel=new Select(day);
			sel.selectByVisibleText("25");
			WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]")); //dropdown
			Select sel1=new Select(month);
			//sel1.selectByVisibleText("Sep"); //string parameter//3 ways to use
			sel1.selectByIndex(8); //int parameter
			sel1.selectByValue("9"); //string parameter value 
			
			WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]")); //dropdown
			Select sel2=new Select(year);
			sel2.selectByVisibleText("1996");
			driver.findElement(By.xpath("//input[@value='1']")).click(); //radio button->pathbyindex
			



		}
		


}
