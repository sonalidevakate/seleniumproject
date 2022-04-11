package TestNGProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCases {
	WebDriver driver;                 //Global variable
	 UtilityClass util;
	 SignupTestData data;
	
	@BeforeClass
	public void OpenBrowser() {
		
		BaseClass base=new BaseClass();                 //Base calss object
		base.driverInit();
		
		  driver = new ChromeDriver();	    
		  
		   util=new UtilityClass();                        //Utility class object
		   
		    data=new SignupTestData(driver);
		       
	}

	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
	}
	
	@BeforeMethod
	public void SignupToApp() {
	
		driver.get("https://www.facebook.com/signup");
	}
	
	@AfterMethod
	public void RefreshPage() throws InterruptedException {
	
	driver.navigate().refresh();
	
	Thread.sleep(2000);
		
	}	

	@Test(priority=2,enabled=false)
	public void SignUpTC01() throws EncryptedDocumentException, IOException {
		data.enterFirstname(util.readExcelData(1, 0));
		data.enterLastname(util.readExcelData(1, 1));
		data.enteremail(util.readExcelData(1, 2));
		data.Confirmemail(util.readExcelData(1, 3));
		data.enterNewpassword(util.readExcelData(1, 4));
		data.selectday(util.readExcelData(1, 5));
		data.selectmonth(util.readExcelData(1, 6));
		data.selectyear(util.readExcelData(1, 7));
		data.clickOnradio();
	
		}
	
	@Test(priority=-1)
	public void SignUpTC02() throws EncryptedDocumentException, IOException {
		
		data.enterFirstname(util.readExcelData(2, 0));
		data.enterLastname(util.readExcelData(2, 1));
		data.enteremail(util.readExcelData(2, 2));
		data.Confirmemail(util.readExcelData(2, 3));
		data.enterNewpassword(util.readExcelData(2, 4));
		data.selectday(util.readExcelData(2, 5));
		data.selectmonth(util.readExcelData(2, 6));
		data.selectyear(util.readExcelData(2, 7));
		data.clickOnradio2();
	
		}
	@Test(priority=1)
	public void SignUpTC03() throws EncryptedDocumentException, IOException {
		
		data.enterFirstname(util.readExcelData(3, 0));
		data.enterLastname(util.readExcelData(3, 1));
		data.enteremail(util.readExcelData(3, 2));
		data.Confirmemail(util.readExcelData(3, 3));
		data.enterNewpassword(util.readExcelData(3, 4));
		data.selectday(util.readExcelData(3, 5));
		data.selectmonth(util.readExcelData(3, 6));
		data.selectyear(util.readExcelData(3, 7));
		data.clickOnradio();
	
		
		}
	@Test(priority=2)
	public void SignUpTC04() throws EncryptedDocumentException, IOException {
		
		data.enterFirstname(util.readExcelData(4, 0));
		data.enterLastname(util.readExcelData(4, 1));
		data.enteremail(util.readExcelData(4, 2));
		data.Confirmemail(util.readExcelData(4, 3));
		data.enterNewpassword(util.readExcelData(4, 4));
		data.selectday(util.readExcelData(4, 5));
		data.selectmonth(util.readExcelData(4, 6));
		data.selectyear(util.readExcelData(4, 7));
		data.clickOnradio();
	
		
		}
	@Test(priority=0)
	public void SignUpTC05() throws EncryptedDocumentException, IOException {
		
		data.enterFirstname(util.readExcelData(5, 0));
		data.enterLastname(util.readExcelData(5, 1));
		data.enteremail(util.readExcelData(5, 2));
		data.Confirmemail(util.readExcelData(5, 3));
		data.enterNewpassword(util.readExcelData(5, 4));
		data.selectday(util.readExcelData(5, 5));
		data.selectmonth(util.readExcelData(5, 6));
		data.selectyear(util.readExcelData(5, 7));
		data.clickOnradio2();
	
		}


}
