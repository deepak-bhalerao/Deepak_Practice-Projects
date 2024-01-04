import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Move 
{
	WebDriver obj;
	public void Demo()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.marionette", "D:\\geckodriver.exe");
		obj=new ChromeDriver();
		//obj= new FirefoxDriver();
		obj.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}	
	public void m1()
	{
		obj.get("http://www.google.co.in");
		obj.findElement("")
		WebElement e=obj.findElement(By.linkText("Downloads - Selenium"));
		Actions aa=new Actions(obj);
		aa.contextClick(e).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ENTER).perform();
	}

}
