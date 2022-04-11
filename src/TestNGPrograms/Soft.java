package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft {
	@Test
	public void tc01() {
		
		String str1 = "Hi";  
		String str2 = "Hello";
		SoftAssert soft = new SoftAssert(); //create object of SoftAssertclass 
		
		soft.assertEquals(str1,str2);   //Failed  //All are Non-static methods.
		soft.assertEquals(true, false);  //boolean value
		soft.assertEquals(12, 15); //int value
		soft.assertEquals('a', 'b'); //char value
		
		soft.assertNotEquals(str1, str2);   //pass

		
		boolean status = false;
		soft.assertTrue(status);	//Failed
		soft.assertFalse(status);	//passed

		
		String str=null;  
		soft.assertNull(str); //passed
		soft.assertNotNull(str); //failed

				
		System.out.println("After assertion");
		
		soft.assertAll(); // failed tc01
		
	}


}




