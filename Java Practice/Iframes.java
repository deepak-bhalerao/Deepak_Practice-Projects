package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;			
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		Thread.sleep(10000);
		driver.switchTo().frame("iframe2");
		WebElement practieAutomation =  driver.findElement(By.xpath("//h1[text()='Home']"));
		System.out.println(practieAutomation.getText());
		driver.findElement(By.xpath("//a[text()='Tab 2 ']")).click();
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.xpath("//b[text()='Content 2 Title']/following-sibling::p[text()='The content could contain anything text page or submit form or any other HTML objects.']")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//h1[text()='Sample Iframe page']")).getText());
		driver.quit();
	}
}
