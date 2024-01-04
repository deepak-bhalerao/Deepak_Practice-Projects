import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Demo 
{
	WebDriver obj;
public Demo()
{
	//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	System.setProperty("webdriver.firefox.marionette", "D:\\geckodriver.exe");
	//obj=new ChromeDriver();
	obj= new FirefoxDriver();
	obj.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
}	

public void f1()
{
	obj.get("http://www.zensar.com");
	obj.findElement(By.xpath("//*[@id='megamenu-mlid-305']"));
	obj.findElement(By.xpath("//*[@class='sfsbc']")).click();
	
	List<WebElement> list= obj.findElements(By.xpath("//*[@class='sbsb_c gsfs']"));
	for (int i = 0; i < list.size(); i++) 
	{
		System.out.println(list.get(i).getText());
	}
	
	list.get(0).click();
	
	WebElement e=obj.findElement(By.xpath("//*[@id='megamenu-mlid-305']"));
	Actions aa=new Actions(obj);
	aa.moveToElement(e).perform();
	List<WebElement> list1=obj.findElements(By.xpath("//*[@id='megamenu-mlid-307']"));
	list1.get(0).click();
		
}
public static void main(String[] args) 
{
	Demo w= new Demo();
	w.f1();
}
}
