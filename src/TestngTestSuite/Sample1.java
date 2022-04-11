package TestngTestSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void tc01() {
		Reporter.log("TC01 Exeuted",true);
	}
	
	@Test
	public void tc02() {
		Reporter.log("TC02 Exeuted",true);
	}
	
	@Test
	public void tc03() {
		Reporter.log("TC03 Exeuted",true);
	}
	
}

