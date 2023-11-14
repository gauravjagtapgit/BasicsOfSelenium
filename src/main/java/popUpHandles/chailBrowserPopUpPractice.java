package popUpHandles;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class chailBrowserPopUpPractice {

	public static void main(String[] args) throws InterruptedException  {
		 WebDriver driver;
			
			
		 		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver\\chromedriver.exe");
		 
		ChromeOptions options=new  ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY,options);
		options.merge(cp);
		
		    driver=new ChromeDriver(options);
		    
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			String url="https://www.flipkart.com/";
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			WebElement searchFild=driver.findElement(By.name("q"));
			searchFild.sendKeys("Apple");
			
			 driver.findElement(By.xpath("//button[@type=\"submit\"]//*[name()=\"svg\"]")).click();
		      Thread.sleep(3000);
		      
		      for(int i=1;i<=4;i++) {
		    	  driver.findElement(By.xpath("(//div[@class='_2kHMtA'])["+ i +"]")).click();
		      }
		      
		      Set<String> address=driver.getWindowHandles();
		      List<String> addressList=new ArrayList<>(address);
		      for(int i=0;i<5;i++) {
		    	  driver.switchTo().window(addressList.get(i));
//		    	  if(i==0) {
//		    		  continue;
//		    	  }else {
//		    		  driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
//		    	  }
		     	 if(i !=0) {
		        	 driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
		        	 //System.out.println(driver.getTitle());
		        	 }
		      }
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	

}
