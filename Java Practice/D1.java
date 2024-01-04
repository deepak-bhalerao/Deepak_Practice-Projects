package auto;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class D1
{
	WebDriver obj;
	public void demo()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.marionette", "D:\\geckodriver.exe");
		obj=new ChromeDriver();
		//obj= new FirefoxDriver();
		obj.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	public void d2()
	{
		obj.get("http://www.google.com");
		obj.findElement(By.xpath("//*[@class='gb_b gb_Vb']")).click();
		//obj.findElement(By.xpath("//*[@class='gb_Z']")).click();
		
		obj.findElement(By.xpath("//*[@class='maia-button button-download mobile-is-hidden get-started go-to-drive']")).click();
		obj.findElement(By.id("Email")).sendKeys("blendinfo23");
		obj.findElement(By.id("next")).click();
		obj.findElement(By.name("Passwd")).sendKeys("atanu@123");
		obj.findElement(By.id("signIn")).click();
		
		List<WebElement> list= obj.findElements(By.xpath("//*[@class='gb_Z']"));
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i).getText());
		}
		
		list.get(7).click();	
		WebElement e=obj.findElement(By.xpath("//*[@class='l-t-T-c-j']"));
		WebElement e1=obj.findElement(By.xpath("//*[@class='l-t-T-c-j']"));
		Actions a=new Actions(obj);
		a.clickAndHold(e).moveToElement(e1).perform();
	
	}
	public static void main(String[] args) 
	{
		D1 dd=new D1();
		dd.demo();
		dd.d2();		
	}
}