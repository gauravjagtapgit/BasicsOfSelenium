package popUpHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class authenticationPopUp {

	public static void main(String[] args) {
		WebDriver driver;
		
		
 		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\gauav\\driver\\chromedriver.exe");
		 
		ChromeOptions options=new  ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY,options);
		options.merge(cp);
		
		    driver=new ChromeDriver(options);
		   String url="https://the-internet.herokuapp.com/basic_auth";
		   String userName="admin";
		   String password="admin";
		   String newurl="https//"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		   driver.get(newurl); 
	}

}
