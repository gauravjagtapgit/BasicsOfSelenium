package pomBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageOfFlipkart {
	
	
	public static WebDriver driver;

	@FindBy (xpath="//button[text()='✕']")
	private WebElement cancel;
	
	@FindBy (xpath="//input[@name='q']")
	private WebElement searhContext;
	
	@FindBy (xpath="(//*[name()='svg'])[1]")
	private WebElement searhBtn;
	
	
	public HomePageOfFlipkart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void firstCancleAuthantication() {
	   cancel.click();;
	}

	public void searchFild() {
		searhContext.sendKeys("realme");
	}
	public void searchTheContaint() {
		searhBtn.click();;
	}
	public static void main(String[] args) {
		
	
WebDriverManager.firefoxdriver().setup();
	
	driver = new FirefoxDriver();
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
	
	
	HomePageOfFlipkart hpf=new HomePageOfFlipkart(driver);
	
	hpf.firstCancleAuthantication();
	hpf.searchFild();
	hpf.searchTheContaint();
	
	
}
}