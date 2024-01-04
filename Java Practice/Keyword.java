package testscript;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyword {
	
	static FirefoxDriver driver;
	
	static FileInputStream file;
	
	
	static Properties prop;
	
	public void openbrowser()throws Exception
	{
	
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		file = new FileInputStream("E:\\Crmframework\\src\\objecrepository\\prop.properties");
		
		prop = new Properties();
		
		prop.load(file);
	}
	
	public void navigate(String testdata)
	{
		
		driver.get(testdata);
	}
	
public void input(String testdata , String objectname )
{

	driver.findElementByXPath(prop.getProperty(objectname)).sendKeys(testdata);
		
}
public void click(String objectname)
{

	driver.findElementByXPath(prop.getProperty(objectname)).click();
}
public String  verifytitle()
{
	
	String actualvalue = driver.getTitle();
	
	return actualvalue;
	
}
public String verifyPageText(String objectname){
	String actualvalue = driver.findElementByXPath(prop.getProperty(objectname)).getText();
	return actualvalue;
}
}
