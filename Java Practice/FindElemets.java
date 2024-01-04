package com.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElemets {
		
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		List<WebElement> inputTextbox=driver.findElements(By.className("inputtext "));
		Thread.sleep(10000);
		System.out.println(inputTextbox.size());
//		foreach loop
//		for(WebElement we : links)
//		{
//			System.out.println(we.getText());
//		}
		for(int i=0;i<inputTextbox.size();i++)
		{
			System.out.println(inputTextbox.get(i).getAttribute("aria-label"));
		}
		driver.quit();
	}
	
}
