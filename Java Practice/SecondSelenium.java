package com.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondSelenium {
static WebDriver driver;	
public static void main(String[] args) throws InterruptedException {
	
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	Thread.sleep(10000);
	System.out.println("I am here");
	WebElement fradioButton = driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input"));
//	fradioButton.click();
	if(fradioButton.isSelected())
	{
	System.out.println(fradioButton.isSelected());
	}else
	{
		System.out.println(fradioButton.isSelected());
		fradioButton.click();
	}
	if(fradioButton.isSelected())
	{
	System.out.println(fradioButton.isSelected());
	}
	
	WebElement dayDrop = driver.findElement(By.xpath("//select[@id='day']"));
	Select daySelect = new Select(dayDrop);
	daySelect.selectByIndex(30);
	Thread.sleep(5000);
	daySelect.selectByValue("1");
	Thread.sleep(5000);
	daySelect.selectByVisibleText("30");
	for(int i=0;i<daySelect.getOptions().size();i++)
	{
		System.out.println(daySelect.getOptions().get(i).getText());
	}
	
	for(WebElement s : daySelect.getOptions())
	{
		System.out.println(s.getText());
		if(s.getText().equalsIgnoreCase("12"))
		{
			daySelect.selectByVisibleText(s.getText());
		}
	}
	
	
	Thread.sleep(10000);
	driver.quit();
}
	
}
