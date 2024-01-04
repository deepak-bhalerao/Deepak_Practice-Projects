package Uploading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadfile 
{

	WebDriver obj;
	public void abc() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//System.setProperty("web
		obj.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
		
	public void Search() throws InterruptedException
	
	{		
		//obj=new FirefoxDriver();
		obj.get("http://www.gmail.com");
		obj.findElement(By.id("Email")).sendKeys("blendinfo23");
		obj.findElement(By.id("next")).click();
		
		obj.findElement(By.name("Passwd")).sendKeys("atanu@123");
		obj.findElement(By.id("signIn")).click();
		
		obj.findElement(By.xpath(".//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		obj.findElement(By.xpath(".//*[@class='vO']")).sendKeys("deepak.a.bhalerao@gmail.com");
		obj.findElement(By.xpath(".//*[@class='aoT']")).sendKeys("File");
		obj.findElement(By.xpath(".//*[@class='Am Al editable LW-avf']")).sendKeys("Hi...");
		obj.findElement(By.xpath(".//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
		obj.findElement(By.xpath(".//*[@id=':6n']/div/div[1]")).click();
	    Thread.sleep(5000);
		obj.findElement(By.xpath(".//*[@id='gb_71']")).click();		
		}
	

	public static void main(String[] args) throws InterruptedException 
	{
		uploadfile s=new uploadfile();
		s.abc();
		
	}
	
}
