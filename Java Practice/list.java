import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class list {
	WebDriver w;
	public list()
	{
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver.exe");
		w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		}
	
	
	public void mouseover()throws InterruptedException
	
	{
		
		w.get("http://blendinfotech.com/");
		WebElement b=w.findElement(By.xpath(".//*[@id='top-menu']/li[2]/a"));
		Actions a= new Actions(w);
		a.moveToElement(b).perform();
		Thread.sleep(2000);
		w.findElement(By.xpath(".//*[@id='top-menu']/li[2]/ul/li[3]/a")).click();
		
		}
	public static void main(String[] args)throws InterruptedException 
	{
		list l=new list();
		l.mouseover();
		
	}

}
	
