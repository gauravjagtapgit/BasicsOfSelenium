package BasicsActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_account {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver2\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
//	       driver.get("https://www.youtube.com");
	       driver.get("https://accounts.google.com/");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//span[text()='Create account']")).click();
	       driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
	       driver.findElement(By.name("firstName")).sendKeys("gaurav");
	     
	       driver.findElement(By.name("lastName")).sendKeys("jagtap");
	       driver.findElement(By.name("Username")).sendKeys("gauravjagtap1347");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("jaga@5464");
	       driver.findElement(By.name("ConfirmPasswd")).sendKeys("jaga@5464");
	       driver.findElement(By.xpath("//span[text()='Next']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//div[contains(@class,'VfPpkd')]")).click();
        Thread.sleep(3000);
       List<WebElement> list= driver.findElements(By.xpath("//ul[contains(@class,'VfPpkd-StrnGf-rymPhb')]//li"));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().equals("India (+91)")) {
        		list.get(i).click();
        		break;
        	}
        }
       Thread.sleep(300);
       driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9921207419");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[text()='Next']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='TquXA']")).click();
       Thread.sleep(2000);
     //  List<WebElement>list1=driver.findElement(By.xpath("))
	}

}
