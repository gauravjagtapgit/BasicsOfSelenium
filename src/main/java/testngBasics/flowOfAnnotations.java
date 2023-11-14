package testngBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flowOfAnnotations {
	
	@BeforeSuite
	public void setup() {
		System.out.println("1-setup method");
	}
	@BeforeTest
	public void lonchBrowser() {
		System.out.println("2-lonchBrowser");
	}
	@BeforeClass
	public void loginapp() {
		System.out.println("3-login app");
	}
	@BeforeMethod
	public void url() {
		System.out.println("4-lounch url");
	}
	@Test
	public void TestCases() {
		System.out.println("5-Test cases");
	}
	@AfterMethod
	public void logout() {
		System.out.println("6-Logout");
	}
	@AfterClass
	public void closedbrowser() {
		System.out.println("7-closed browser");
	}
	@AfterTest
	public void delete() {
		System.out.println("8-delet All cookies");
	}


}
