package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertFail {
	@Test
	public void login() {       //fail login mthd.
		System.out.println("Login to aplication");
		Assert.fail();
	}
	
	
	@Test(dependsOnMethods = "login")  //its depend on login mthd.
	public void logout() {
		System.out.println("logout from aplication");


       } 




}
