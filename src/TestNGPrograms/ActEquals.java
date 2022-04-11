package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;

public class ActEquals {
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
			WebDriver driver = new ChromeDriver();		
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			
			String actTitle = driver.getTitle();
			System.out.println(actTitle);
			
		
			String expTitle = "Sign up for Facebook | Facebook";
			
			if(actTitle.equals(expTitle)) 
			{
				System.out.println("Test case Passed");
			} 
			else 
			{
				System.out.println("Test case failed");
			}
			
		}

	}



