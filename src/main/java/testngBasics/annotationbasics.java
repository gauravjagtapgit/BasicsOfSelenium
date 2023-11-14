package testngBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class annotationbasics {
	WebDriver driver;
	@BeforeMethod
  public void setup() {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver2\\chromedriver_win32 (6)\\chromedriver.exe");
		 driver =new ChromeDriver();
		String baseUrl = "https://www.google.com";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
//		System.getProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver2\\chromedriver_win32 (6)\\chromedriver.exe");
//		driver =new ChromeDriver();
//		String baseUrl="https://www.google.com";
//		driver.get(baseUrl);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}

	@Test(priority=1,groups="Title Test")
	public void googletitletest() {
	String title=driver.getTitle();
	System.out.println(title);
	
	}
	@Test(priority=2,groups="Gmail Linke")
	public void gmaillinke() {
		boolean b= driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
	}
	@Test(priority=3,groups="Logo Test")
	public void logoTest() {
		boolean b= driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("test2");
	}
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("test3");
	}
	
   @AfterMethod
   public void tearDown() {
	   driver.quit();
   }
   
}




