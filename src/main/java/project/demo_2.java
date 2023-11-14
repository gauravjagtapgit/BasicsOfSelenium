package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_2 {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("Webdriver.driver.Chrome","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\project\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\project\\driver\\Chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.bbc.com/news");
	  driver.navigate().to("https://www.bbc.com/news");
	  driver.manage().window().maximize();
	  Thread.sleep(500);
	 driver.manage().window().minimize();
	 String t=driver.getTitle();
	 System.out.println(t);
	 driver.close();
	 
	
	}

}
//C:\Users\ADMIN\eclipse-workspace\gauav\project\driver\chromedriver.exe