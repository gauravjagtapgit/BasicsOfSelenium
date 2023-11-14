package popUpHandles;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ScreenShotMethod.screenShot_demo2;

public class Select_list {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = screenShot_demo2.setproperty();
        openPage(driver);
        Thread.sleep(2000);
        listItems(driver);
    }

    public static void openPage(WebDriver driver) {
        driver.get("https://www.flipkart.com/");

        // Close the pop-up if it's present
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))).click();
    }

    public static void listItems(WebDriver driver) {
        List<WebElement> listOfProduct = driver.findElements(By.xpath("//div[@class='_37M3Pb']//a"));

        System.out.println("Total Product list is ===> " + listOfProduct.size());
        System.out.println("<<<<<<<<<<<[Text]>>>>>>>>>>>");

        for (WebElement product : listOfProduct) {
            System.out.println("Product Interface");
            System.out.println(product.getText());

            if (product.getText().equals("Fashion")) {
                product.click();
                break;
            }
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
