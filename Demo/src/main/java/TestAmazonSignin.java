import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazonSignin 
{
	
 		 public static void main(String []arg) throws Exception
		  {
		        // Create an instance of WebDriver
		     WebDriver driver = new ChromeDriver();
		     Actions action=new Actions(driver);
		     
			  // Launch the Amazon site
			 driver.get("https://www.amazon.in/");
			
			 System.out.println(driver.getTitle());
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			 
			 WebElement web= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			 action.moveToElement(web).perform();
			 
			 web= driver.findElement(By.xpath("//a[@class='nav-action-signin-button']")); 
			 web.click(); 
			 
			  //Thread.sleep(3000);
			  
			  System.out.println(driver.getTitle());
			  
			  WebElement emaiID=driver.findElement(By.xpath("//input[@id='ap_email']"));
			  emaiID.sendKeys("9890557303");
			  
			  Thread.sleep(3000);
			  
			  WebElement subButton= driver.findElement(By.xpath("//input[@id='continue']"));
			  subButton.click();
			  
			  WebElement passButton= driver.findElement(By.xpath("//input[@id='ap_password']"));
			  passButton.sendKeys("Deep@k");
			  
			  WebElement signButton= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
			  signButton.click();
			  
			  System.out.println(driver.getTitle());
			  driver.close();
	}
}
