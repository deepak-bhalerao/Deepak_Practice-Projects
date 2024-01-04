package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;			
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		
		driver.get("http://www.amazon.in/");
		Actions act = new Actions(driver);
		WebElement shopCategory = driver.findElement(By.xpath("//*[@class='nav-line-2 ' or text()='Category']"));
//		act.moveToElement(shopCategory).build().perform();
		act.dragAndDrop(driver.findElement(By.xpath("//span[text()='Amazon']/parent::a")), driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).build().perform();
		
		Thread.sleep(10000);
		driver.quit();
	}
}
