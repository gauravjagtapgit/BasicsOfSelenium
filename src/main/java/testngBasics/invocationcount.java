package testngBasics;

import org.testng.annotations.Test;

public class invocationcount {
	
	@Test(invocationCount=10)
	public void cout() {
		int a=10;
		int b=36;
		int c=a+b;
		System.out.println("sum of count===>"+c);
	}

}
