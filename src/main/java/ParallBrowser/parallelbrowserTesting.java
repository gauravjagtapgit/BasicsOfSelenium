package ParallBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelbrowserTesting {
	WebDriver driver;
	
	@Test
	public void firstExecution() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		System.out.println("I am inside Test 1 | method"+Thread.currentThread().getId());
		driver.quit();
	}
	@Test
	public void secondExecution() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		System.out.println("I am inside Test 2 | method"+Thread.currentThread().getId());
		driver.quit();
	}

}
