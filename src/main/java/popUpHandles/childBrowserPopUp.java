package popUpHandles;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\chromedriver_win32 (7)\\chromedriver.exe");
		    driver=new ChromeDriver();
			String url="https://www.flipkart.com/";
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
     WebElement inputFild=  driver.findElement(By.xpath("//input[@name='q']"));
      inputFild.sendKeys("realme");
    //  inputFild.sendKeys(Keys.ENTER);
      driver.findElement(By.xpath("//button[@type=\"submit\"]//*[name()=\"svg\"]")).click();
      Thread.sleep(3000);
      
      for(int i=1;i<=3;i++) {
    	  driver.findElement(By.xpath("(//div[@class='_2kHMtA'])["+ i +"]")).click();
      }
      
     Set<String> address= driver.getWindowHandles();
     
     List<String> addressList=new ArrayList<>(address);
     
     for(int i=0;i<4;i++) {
    	 driver.switchTo().window(addressList.get(i));
    	 
    	 //first index is main page that why we cann't add to cart
    	 //we write 1st code
//    	 if(i==0) {
//    		 continue;
//    	 }
    	 //or 2nd
    	 if(i !=0) {
    	 driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
    	 //System.out.println(driver.getTitle());
    	 }
     }
     	 
     
			
			
    	 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}