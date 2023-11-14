package iframeHandles;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframePracticeTest {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		String url="https://demoqa.com/nestedframes";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement mainFrame =	driver.findElement(By.xpath("//div[contains(text(),'Sample Nested')]"));
		System.out.println(driver.getTitle());
		System.out.println(mainFrame.getText());
		
		System.out.println("<<switch Parent frame>>");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
		WebElement parentfreame=driver.findElement(By.xpath("(//body)[1]"));
		System.out.println(parentfreame.getText());
		
		System.out.println("<<switch Chileed frame>>");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		WebElement childfreame=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(childfreame.getText());
		
		System.out.println("<<switch Main frame>>");
		
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
   //instant this code we have following code to switch direct main frame
		driver.switchTo().defaultContent();
		
		WebElement mainFrame1 =	driver.findElement(By.xpath("//div[contains(text(),'Sample Nested')]"));
		
		System.out.println(mainFrame1.getText());
		
	
		driver.close();
		try {
		Thread.sleep(4000);   
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	driver.quit();

	}

}
