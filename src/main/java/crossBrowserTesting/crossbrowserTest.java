package crossBrowserTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowserTest {
	
WebDriver driver;
//public static ExtentHtmlReporter htmlrepor;
ExtentReports extent;
ExtentTest test;

	FirefoxOptions firefoxoption = new FirefoxOptions();
	ChromeOptions chromeoption = new ChromeOptions();
	
	
	@BeforeClass
	public void beforclassmethod() {
		ExtentHtmlReporter  htmlreport = new ExtentHtmlReporter("crossbrowserReport.html");
	   extent = new ExtentReports();
	  extent.attachReporter(htmlreport);
	
	  test =extent.createTest("crossbrowserTest","My crossBrowser Test For Chrome & Firefox");
	
}
@Parameters("browser")
@BeforeTest
public void initilization(String browser) {
	
	if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		System.out.println("This is firefox launch");
	}
	else if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		System.out.println("This is chrome launch");
		}
	}
	
  @Test
  public void login() {
	  driver.get("https://www.google.com/");
  String actual= driver.getTitle();
  String expected="Google";
  Assert.assertEquals(actual.contains("Google"), expected.contains("Google"));
  Reporter.log("pass login method");
  }
  
  @AfterMethod
  public void aftermethod(ITestResult result) throws IOException {
	  if(result.getStatus()==ITestResult.SUCCESS) {
		  test.log(Status.PASS, result.getName()+" is Pass");
  }
  else if (result.getStatus()==ITestResult.FAILURE) {
	  String path = UtilityForScreenshots.getScreenShotPath(driver, result.getName());
	  
	  test.log(Status.FAIL,result.getName()+" is Fail",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
  }
  else if(result.getStatus()==ITestResult.SKIP) {
	  test.log(Status.FAIL, result.getName() +" is Skipped");
	  }
  }
  
  @AfterClass
  public void afterclass() {
	  extent.flush();
  }
  
  @AfterTest
  
  public void endtest() {
	  driver.quit();
	  
  }

}
