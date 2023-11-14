package testngBasics;

import org.testng.annotations.Test;

public class dependsonmethod {
	@Test
	public void Login() {
		System.out.println("Login the Broser");
	}
	
	@Test(dependsOnMethods="Login")
	public void HomePage() {
		System.out.println("Login the Broser");
	}
	

}
