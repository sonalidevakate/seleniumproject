package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;

public class SignupRunnerParameter {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
			WebDriver driver = new ChromeDriver();		
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			
			SignupParameters sp = new SignupParameters(driver);
			
			//Testcase-01
			sp.enterFirstname("ayush");
			sp.enterLastname("satpute");
			sp.enteremail("ayush@gmail.com");
			sp.Confirmemail("ayush@gmail.com");
			sp.enterNewpassword("98768");
			sp.selectday("20");
			sp.selectmonth("Mar");
			sp.selectyear("2015");
			sp.clickOnradio2();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			//Testcase-02
			sp.enterFirstname("anaya");
			sp.enterLastname("lawate");
			sp.enteremail("anaya@gmail.com");
			sp.Confirmemail("anaya@gmail.com");
			sp.enterNewpassword("34596");
			sp.selectday("4");
			sp.selectmonth("Aug");
			sp.selectyear("2018");
			sp.clickOnradio();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			//Testcase-03
			sp.enterFirstname("sonali");
			sp.enterLastname("Devakate");
			sp.enteremail("sonali12@gmail.com");
			sp.Confirmemail("sonali12@gmail.com");
			sp.enterNewpassword("12345");
			sp.selectday("25");
			sp.selectmonth("sep");
			sp.selectyear("1996");
			sp.clickOnradio();
			Thread.sleep(2000);
			driver.navigate().refresh();

			//Testcase-04
			sp.enterFirstname("anshika");
			sp.enterLastname(" ");
			sp.enteremail(" ");
			sp.Confirmemail(" ");
			sp.enterNewpassword("12670");
			sp.selectday("23");
			sp.selectmonth(" ");
			sp.selectyear("oct");
			sp.clickOnradio();

			
}

}
