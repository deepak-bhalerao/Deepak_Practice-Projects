import java.io.File;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample 
	{
	    public static void main(String[] args) 
	    {
	        // Create an instance of WebDriver
	     WebDriver driver = new ChromeDriver();

	           // Open a webpage
	        driver.get("https://www.amazon.com");

	        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	        
	        // Cast WebDriver to TakesScreenshot
	        TakesScreenshot screenshotDriver = (TakesScreenshot) driver;

	        // Capture the screenshot
	        File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);

	        // Define the destination path for the screenshot
	        File destinationFile = new File("D:\\DemoScreenShots/screenshot.png");

	        try {
	            // Copy the screenshot file to the destination path
	            Files.copy(screenshotFile.toPath(), destinationFile.toPath());
	            
	            System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());
	        } catch (Exception e) 
	        {
	            System.out.println("Failed to capture screenshot: " + e.getMessage());
	        }
	        // Close the browser
	        driver.quit();
	    }
	}
	