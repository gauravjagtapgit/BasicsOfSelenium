package project;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver2\\Chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
//	  driver.get("https://www.nba.com/news/2022-nba-finals-schedule");
//	  
//	  List<WebElement>tab=(List<WebElement>) driver.findElement(By.xpath("//*[@id='onetrust-group-container']"));
//	  WebElement q;
//	  for(int i=0;i<tab.size();i++) {
//		  q=tab.get(i);
//		  System.out.println(q.getText());
	  
//	  driver.get("https://www.w3schools.com/videos/index.php");
//		driver.manage().window().maximize();
//	driver.findElement(By.xpath("//div[text()='Subscribe']")).click();
//
//	driver.findElement(By.xpath("//input[contains(@class,'PasswordInput_input_field__EWMIU')]")).click();
//	driver.findElement(By.xpath("//button[contains(@class,'Button_fullwidth__0HLEu')]")).click();
//	driver.findElement(By.xpath("//button[contains(@class,'wrapper')]")).click();
//	 
	  driver.get("https://www.republicworld.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("(//img[contains(@class,'imghover ')])[1]")).click();
	
	  }
	}

