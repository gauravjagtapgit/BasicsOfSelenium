package BasicsActions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class facebook_creat_account {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\gauav\\\\driver2\\\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement creat = driver.findElement(By.xpath("(//form[@data-testid='royal_login_form']//a)[3]"));
		creat.click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement firstName = driver.findElement(By.xpath("//input[contains(@id,'u_2_b_')]"));
		firstName.sendKeys("GauraV");
		Thread.sleep(2000);
		firstName.clear();
		firstName.sendKeys("gaurav");
		driver.findElement(By.xpath("//input[contains(@id,'u_2_d_')]")).sendKeys("jagtap");
		driver.findElement(By.xpath("//input[contains(@id,'u_2_g')]")).sendKeys("9921207419");
		driver.findElement(By.xpath("//input[contains(@aria-label,'New password')]")).sendKeys("gauav@121");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='day']//option[@value='1']")).click();
		driver.findElement(By.xpath("//select[@id='month']//option[text()='Jul']")).click();
		driver.findElement(By.xpath("//select[@id='year']//option[text()='1997']")).click();
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		boolean select = gender.isSelected();
		System.out.println("Although radio button are not selected privius ===> " + select);
		Thread.sleep(2000);
		// gender.click();--------------+>>>>click radio through Thise
		// method<<<<-------------
		boolean select1 = gender.isSelected();
		if (select1 == true) {
			System.out.println("radio button is selected");
		} else {
			System.out.println("select the radio button");

			gender.click();
		}
		driver.findElement(By.xpath("//div[@class='_1lch']//button")).click();
		Thread.sleep(2000);

		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screen, new File("C:\\Users\\ADMIN\\Downloads\\sample\\facebookotp.jpg"));

	}

}
