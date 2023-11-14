package popUpHandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThirdPartyAutonticationPopUp {

	public static void main(String[] args) {
		WebDriver driver;
		
		
 		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver\\chromedriver.exe");
		 
		ChromeOptions options=new  ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY,options);
		options.merge(cp);
		
		    driver=new ChromeDriver(options);
		    
		    String url="https://www.redbus.in/";
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
			driver.findElement(By.xpath("//li[@id=\"signInLink\"]")).click();
			
			List<String> address=new ArrayList<>(driver.getWindowHandles());
//			for(int i=0;i<3;i++) {
//				driver.switchTo().window(address.get(1));
//				driver.findElement(By.xpath("//div[@xpath='1']")).click();
//			}
			
			
			By element=By.xpath("//div[@xpath='1']");
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement el=wait.until(ExpectedConditions.presenceOfElementLocated(element));
			el.click();
		
			
			
			
	}

}
