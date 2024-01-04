package com.first;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandle {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(10000);
		WebElement buttonNew = driver.findElement(By.xpath("//button[text()='New Browser Window']"));
		String parentWindow = driver.getWindowHandle();
		buttonNew.click();
		Thread.sleep(5000);
		Set<String> childWindows = driver.getWindowHandles();
		for(String window : childWindows)
		{
			if(!window.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(window);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
			}
		}
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);
		driver.quit();
	}
	
}
