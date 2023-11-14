package crossBrowserTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityForScreenshots {
	
public static String getScreenShotPath(WebDriver driver, String methodName) throws IOException {
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String path = methodName +".png";
		
		File dest = new File(path);
		
		FileHandler.copy(source, dest);
		
		return path;
		
	}

}
