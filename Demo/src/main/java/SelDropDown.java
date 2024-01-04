import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelDropDown 
{
	    public static void main(String[] args) 
	    {
		     WebDriver driver = new ChromeDriver();

	        // Navigate to the webpage with the dropdown
	        driver.get("https://www.letskodeit.com/practice");
	        
	        driver.manage().window().maximize();
	        
	        WebElement dropdownElement = driver.findElement(By.id("carselect")); // Locate the dropdown element using its <select> tag
	      
	        Select dropdown = new Select(dropdownElement);
	        List<WebElement> options = dropdown.getOptions(); // Get all the options in the dropdown
	        
	        for (WebElement option : options)   // Print the text of each option
	        {
	            System.out.println(option.getText());
	        }

	        // Close the browser
	        driver.quit();
	    }
}
