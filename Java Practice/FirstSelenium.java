package com.first;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstSelenium implements WebDriver{

	static WebDriver driver;
	static String checkBox = "//*[text()='Remember me']";
	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://twitter.com/login");
		System.out.println("url of website --->> "+ driver.getCurrentUrl());
		Thread.sleep(10000);
		WebElement chxBox = driver.findElement(By.xpath("//*[text()='Remember me']"));
//		System.out.println(chxBox);
//		System.out.println(chxBox.getText());
//		driver.findElement(By.xpath("//*[text()='Remember me']")).getText();
//		WebElement userName =driver.findElement(By.xpath("//h1[text()='Log in to Twitter']/following-sibling::form//input[@placeholder='Phone, email or username']"));
//		if(userName.isDisplayed())
//		{
//			System.out.println(userName);
//			userName.click();
//			userName.sendKeys("Testt");
//			userName.clear();
//			userName.sendKeys("Testt12345567");
////			Thread.sleep(10000);
//			
//		}
//		WebElement button = driver.findElement(By.xpath("//button[text()='Log in']"));
////		button.click();
//		WebElement label = driver.findElement(By.xpath("//*[contains(text(),'Already using Twitter via text')]"));
//		String str = label.getText();
//		System.out.prin1tln("Value of label--->" +str);
//		System.out.println("Value from direct label.getText() -->> " + label.getText());
//		System.out.println("Is displayed-->> "+label.isEnabled());
//		WebElement forgetPwd = driver.findElement(By.linkText("Forgot password?"));
//		System.out.println("Url for forget password is --> "+ forgetPwd.getAttribute("href"));
//		System.out.println(driver.getPageSource());
		if(driver.getPageSource().contains("laxman"))
		{
			System.out.println("present");
		}else
		{System.out.println("Not present");}
		driver.quit();
		
		
	}
	
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

}
