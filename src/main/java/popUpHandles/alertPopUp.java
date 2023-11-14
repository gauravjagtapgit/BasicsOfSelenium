package popUpHandles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		String url="https://demoqa.com/alerts";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		   Alert alert=driver.switchTo().alert();
		   Thread.sleep(3000);
	
		   System.out.println(alert.getText());
	      alert.accept();
	      
	      //open new tab(window)on browser use following code(child browser)
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("window.open()");
//		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
//		Alert alert=driver.switchTo().alert();
//		   System.out.println(alert.getText());
//		   alert.sendKeys("gaurav");
//	    alert.accept();
	  //  driver.quit();
	}

}
