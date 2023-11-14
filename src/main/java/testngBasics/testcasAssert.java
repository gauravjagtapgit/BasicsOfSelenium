package testngBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testcasAssert {
	WebDriver driver;
	@BeforeClass
	public void initilization() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver2\\chromedriver_win32 (6)\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	String baseUrl = "https://www.google.com";
	driver.get(baseUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	

	@Test(priority=1,groups="Title Test")
	public void googletitletest() {
	String title=driver.getTitle();
	System.out.println(title);
	
	Assert.assertEquals(title, "Google","title is not match");
	}
	
	@Test(priority=3,groups="Logo Test")
	public void logoTest() {
		boolean b= driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		
		Assert.assertTrue(b);
	}
	
	  @AfterMethod
	   public void tearDown() {
		   driver.quit();
	   }

}
