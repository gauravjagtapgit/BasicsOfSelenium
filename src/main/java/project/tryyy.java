package project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tryyy {
	public static void main(String[] args) {
	 WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver\\chromedriver.exe");
		ChromeOptions options=new  ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY,options);
		options.merge(cp);
		driver = new ChromeDriver(options);
		String url="https://www.amazon.in/";
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple 12");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		List<WebElement> productPriceElementList=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			
			for(int i=0;i<productPriceElementList.size();i++) {
				System.out.println( productPriceElementList.get(i).getText());
			
		}
	}
}
