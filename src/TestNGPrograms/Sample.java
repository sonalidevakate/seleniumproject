package TestNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void TC1() {
		System.out.println("TC1 is Executed");
	}
	@Test
	public void TC2() {
		System.out.println("TC2 is Executed");		
	}
	@BeforeMethod
	public void Login() {
		System.out.println("Login successfully");
	}
	@AfterMethod
	public void Logout() {
		System.out.println("LOgout");
	}
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("browser launched");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("browser closed ");

	}

}
