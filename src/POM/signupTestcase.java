package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;

public class signupTestcase {
public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		SignupPom sp = new SignupPom(driver);
		
		sp.enterFirstName();
		sp.enterLastName();
		sp.enterEmail();
		sp.ConfirmEmail();
		sp.enterNewPassword();
		sp.selectDay();
		sp.selectMonth();
		sp.selectYear();
		sp.clickOnRadio();

		
	}

}



