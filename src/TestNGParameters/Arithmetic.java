package TestNGParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Arithmetic {
	@Test
	
	@Parameters({"a","b"})
	public void add(int c,int d)
	{
		int sum=c+d;
		System.out.println("addition of two nos..." + sum);
	}

	@Test
	
	@Parameters({"a","b"})
	public void sub(int p,float q) 
	{
		float subs=p-q;
		System.out.println("substraction of two nos..." + subs);

	}

	
	

}
