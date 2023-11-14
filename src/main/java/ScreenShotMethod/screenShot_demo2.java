package ScreenShotMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class screenShot_demo2 {
		 
		
				public static WebDriver setproperty() {
					System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\gauav\\\\driver2\\\\Chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					return driver;
					
				}
				public static void main(String[] args) throws InterruptedException, IOException {

					
					WebDriver driver= screenShot_demo2.setproperty();
					 screenShot_demo2.youtube(driver);
					
				
					 screenShot_demo2.tacksscreenshot(driver,"BeforSelect", 1);
			
					 screenShot_demo2.voicSearch(driver);
					 
					 screenShot_demo2.tacksscreenshot(driver,"AfterSelect_voiceButton", 1);
					
				}
				public static void youtube(WebDriver driver) throws InterruptedException  {	
			    driver.get("https://www.youtube.com/");
			    driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("centeral cee");
			    driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
			    Thread.sleep(3000);
				}
			   
			    
			 public static void tacksscreenshot(WebDriver driver,String fileName,int witchTime) throws IOException, InterruptedException {
				 for(int i=0;i<=witchTime;i++) {
				 TakesScreenshot ts =(TakesScreenshot)driver;
				 File source= ts.getScreenshotAs(OutputType.FILE);
				 
				 File destination= new File("C:\\Users\\ADMIN\\Downloads\\sample\\"+fileName+i+".jpg");
				 FileHandler.copy(source, destination); 
				 Thread.sleep(3000);
			   } 
			 }
			 public static void voicSearch(WebDriver driver) throws InterruptedException {
				 
	      driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-button-renderer'])[2]")).click();
//				 JavascriptExecutor js =(JavascriptExecutor)driver;
//				WebElement element= driver.findElement(By.xpath("//yt-formatted-string[text()='Central Cee - Doja (Directed by Cole Bennett)']"));
//				 js.executeScript("argumants[0].click();",element);
				 Thread.sleep(3000);
			 }
			
}
