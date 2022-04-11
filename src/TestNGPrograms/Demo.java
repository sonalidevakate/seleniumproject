package TestNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {

	@BeforeMethod
	public void loginToApp() {
		Reporter.log("Application Login successful",true);
	}
	
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout from application",true);
	}
	
	@BeforeClass
	public void launchBrowser() {
		Reporter.log("Launch Browser",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("CLose Browser",true);
	}

	@Test 
	public void TC1() {
		Reporter.log("TC1 is Executed",true);
	}

	@Test 
	public void TC2() {
		Reporter.log("TC2 is Executed",true);
	}

}
