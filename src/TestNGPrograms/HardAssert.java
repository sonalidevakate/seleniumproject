package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void Hardequals() { // test case pass
		String str1 = "Java"; // expected result
		String str2 = "Java"; // actual result
		Assert.assertEquals(str1, str2); // static method
	}

	@Test
	public void HardNotequals() { // test case failed
		String str1 = "Java";
		String str2 = "Java";
		Assert.assertNotEquals(str1, str2); // static method
	}

	@Test
	public void HardTrue() { // test case passed
		boolean status = true; // boolean value
		Assert.assertTrue(status); // static method
	}

	@Test
	public void HardFalse() { // test case passed
		boolean b = false; // boolean value
		Assert.assertFalse(b); // static method
		// Assert.fail(); //This mthd. test case is failed or not execute
	}

	@Test
	public void HardNull() { // test case passed
		String str = null; // null value
		Assert.assertNull(str); // static method
	}

	@Test
	public void HardNotNull() { // test case failed
		String str = null; // null value
		Assert.assertNotNull(str); // static method

	}
}
