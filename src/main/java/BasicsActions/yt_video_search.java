package BasicsActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import script_executor.javascriptExecutor;

public class yt_video_search{
	  public static void main(String[]args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\project\\driver\\ChromeDriver.exe");
	    
		  WebDriver driver=new ChromeDriver();
		  
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("youtube");
		Thread.sleep(2000);
      //List<WebElement>list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
         List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
          Thread.sleep(2000);
		  System.out.println("Google li size===>"+list.size());
		    for(int i=0;i<list.size();i++) {
			 System.out.println("suggetion list is===>"+list.get(i).getText());
			  if(list.get(i).getText().equals("YouTube")); {
				list.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//h3[text()='YouTube']")).click();
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("nopixel");
		  Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		   Thread.sleep(7000);
 	//	    driver.findElement(By.partialLinkText("https://i.ytimg.com/an_webp/6BAPS6jcDwA/mqdefault_6s.webp?du=3000&sqp=CNDqx5gG&rs=AOn4CLAGfJriLJ47e19ot386V4VmG3Oojg")).click();
	//	      List<WebElement> list1=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@id='sbse0']"));
		      List<WebElement> list1=driver.findElements(By.xpath("//ul[@role='listbox']"));
		       Thread.sleep(2000);
		        System.out.println("youTube li list===>"+list1.size());
		        driver.findElement(By.xpath("//ytd-video-renderer[@class='style-scope ytd-item-section-renderer']//img[contains(@src,'https://i.ytimg.com/vi/6ENehzUUo4A/hqdefault.')]")).click();
	
		        javascriptExecutor js=(javascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,4000)");
	  
	  }
}   