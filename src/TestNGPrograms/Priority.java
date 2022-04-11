package TestNGPrograms;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=1)
	public void tc01() {
		System.out.println("TC01 executed");
	}
	
	@Test(priority=-1)
	public void tc02() {
		System.out.println("TC02 executed");
	}
	
	@Test(priority=0)
	public void tc03() {
		System.out.println("TC03 executed");
	}

}


