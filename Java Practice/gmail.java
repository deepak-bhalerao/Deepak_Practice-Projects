package Uploading;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	WebDriver driver;
	public gmail()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);

	}
	public void signin()throws InterruptedException, IOException
	{
		
	driver.get("https://www.gmail.com");

	driver.findElement(By.id("Email")).sendKeys("deepak.a.bhalerao");
	driver.findElement(By.id("next")).click();
	driver.findElement(By.id("Passwd")).sendKeys("deep@k#120");
	driver.findElement(By.id("signIn")).click();
	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	
	driver.findElement(By.xpath("//*[@class='wO nr l1']/textarea")).sendKeys("kgbarve23@gmail.com");
	driver.findElement(By.xpath("//input[@class='aoT']")).sendKeys("selenium project");
	driver.findElement(By.xpath(".//*[@class='Am Al editable LW-avf']")).sendKeys("hello sir. welcome to selenium project");
	
	driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
       Thread.sleep(5000);
       Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\zapa1234.exe");
    driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
       
//driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/u/0/#sent']")).click();
       
    driver.findElement(By.xpath("//*[@class='gb_7a gbii']/span")).click();
    driver.findElement(By.xpath("//*[@class='gb_Fa gb_Ee gb_Me gb_vb']")).click();
	}
	public static void main(String[]args)throws InterruptedException, IOException
	{
	gmail y=new gmail();
	y.signin();
	}

}
