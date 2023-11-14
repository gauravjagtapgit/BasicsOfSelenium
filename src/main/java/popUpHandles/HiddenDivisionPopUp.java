package popUpHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HiddenDivisionPopUp {
	
  public static void main(String[] args) {
	 WebDriver driver=null;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
	  		+ "\\gauav\\driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	   String url="https://www.flipkart.com/";
	   driver.get(url);
	   driver.manage().window().maximize();
	   
  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9921207419");
  driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
 
 try {
   Thread.sleep(9000);
      }catch(InterruptedException e) {
	   e.printStackTrace();
      }
 driver.findElement(By.xpath("//button[text()='✕']")).click();
	   
	   driver.quit();  
   }
}
