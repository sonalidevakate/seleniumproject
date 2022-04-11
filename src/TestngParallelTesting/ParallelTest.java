package TestngParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SeleniumConfiguration.Configuration;

public class ParallelTest {
	@Test
	public void tc01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void tc02() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		driver.close();
	}

	@Test
	public void tc03() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

		driver.close();
	}
}


