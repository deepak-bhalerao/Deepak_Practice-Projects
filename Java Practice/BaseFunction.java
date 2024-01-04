package com.baseFunction;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseFunction {

	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setUpBrowser() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	public void launchURL(String url) {
		driver.get(url);
	}

	public WebElement find(By by) {
		return driver.findElement(by);
	}

	public List<WebElement> finds(By by) {
		return driver.findElements(by);
	}

	public void click(By by) {
		find(by).click();
	}

	public void sendKeys(By by, String texttoSend) {
		find(by).sendKeys(texttoSend);
	}

	public String getText(By by)
	{
		return find(by).getText();
	}
	
	public void quit() {
		driver.quit();
	}

}

