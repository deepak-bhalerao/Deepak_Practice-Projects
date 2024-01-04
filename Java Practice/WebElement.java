import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebElement
{
	WebDriver wb;
	public void Demo()
	{
		System.setProperty("webdriver.firefox.marionette", "D:\\geckodriver.exe");
		wb=new FirefoxDriver();
		wb.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
		public void Demo1()
		{
			wb.get("http://www.google.co.in");
			wb.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("Selenium");
			List<WebElement> lst=wb.findElement(By.xpath(""))
						
		}
			public static void main(String[] args) 
			{
				WebElement w=new WebElement();
				w.Demo();
			}
		
}
