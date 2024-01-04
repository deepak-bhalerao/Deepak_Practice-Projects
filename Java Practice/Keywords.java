package testscript;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keywords {
	
	WebDriver driver;
	 FileInputStream fi;
	 Properties prop;
	
	public void openbrowser() throws Exception
	{
		 driver=new FirefoxDriver() ;
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 fi=new FileInputStream("E:\\Crmframework\\src\\objecrepository\\prop.properties");
		 prop= new Properties();
		prop.load(fi);
	}
	public void navigate(String testdata){
		
		driver.get("http://salesforce.com/");
		driver.manage().window().maximize();
		
	}
	public void input(String testdata, String objectname){
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(testdata);
		}
	public void click(String objectname){
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();
	}
	
	
	

}
