package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class yahoo 
{
	WebDriver obj;	
	public yahoo()
	{
		System.setProperty("webdriver.firefox.marionette", "D:\\geckodriver.exe");
		obj=new FirefoxDriver();
		obj.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	public void signup() throws InterruptedException
	{
		obj.get("https://login.yahoo.com/account/create?specId=yidReg&lang=en-IN&src=fpctx&done=https%3A%2F%2Fin.yahoo.com%2F%3Fp%3Dus&display=login&intl=in");
		obj.findElement(By.id("usernamereg-firstName")).sendKeys("Deepak");
		obj.findElement(By.id("usernamereg-lastName")).sendKeys("Bhalerao");
		obj.findElement(By.id("usernamereg-yid")).sendKeys("deepakbhalerao134");
		obj.findElement(By.id("usernamereg-password")).sendKeys("12345678910");
		obj.findElement(By.id("usernamereg-phone")).sendKeys("9890557303");
		
		WebElement mom=obj.findElement(By.name("mm"));
		Select sel=new Select(mom);
		sel.selectByValue("1");
		
		WebElement d=obj.findElement(By.name("dd"));
		Select sel1=new Select(d);
		sel1.selectByValue("5");
		
		WebElement Y=obj.findElement(By.name("yyyy"));
		Select sel2=new Select(Y);
		sel2.selectByIndex(3);
		
		WebElement g=obj.findElement(By.name("gender"));
		Select sel22=new Select(g);
		sel22.selectByValue("male");
		obj.findElement(By.id("reg-submit-button")).click();
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		yahoo y=new yahoo();
		y.signup();
	}
}
