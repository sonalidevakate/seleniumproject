package TestngTestSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	
	@Test(groups="sell") 
	public void tc07() {
	Reporter.log("Test case 07 Exeuted",true);
	
}

@Test(groups="buy") 
public void tc08() {
	Reporter.log("Test case 08 Exeuted",true);
	
}

@Test(groups="sell") 
public void tc09() {
	Reporter.log("Test case 09 Exeuted",true);
	
}

}


