package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alert {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(10000);
		WebElement alertWeb = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alertWeb.click();
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(10000);
		driver.quit();
	}
}

