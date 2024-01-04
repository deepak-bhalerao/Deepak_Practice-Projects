package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class signin
{
	WebDriver obj;
	public signin() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.marionette", "D:\\geckodriver.exe");
		obj=new FirefoxDriver();
		obj.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
		public void abc() throws InterruptedException
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
		Thread.sleep(3000);
		obj.findElement(By.xpath(".//*[@id='gb_71']")).click();		
		}
		
		public void google()
		{
			obj.get("http://www.google.co.in");
			obj.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("selenium");
		}
	public static void main(String[] args) throws InterruptedException 
	{
		signin s=new signin();
		s.abc();
		
	}
}
