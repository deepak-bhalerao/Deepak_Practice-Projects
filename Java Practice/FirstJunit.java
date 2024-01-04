package com.Testcases;

import static org.junit.Assert.*;
import com.verify.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseFunction.BaseFunction;


public class FirstJunit {
	BaseFunction bs = new BaseFunction();
	
	By tabaleby = By.xpath("//table[@class='tsc_table_s13']");
	By sampleby = By.xpath("//h1[text()='Sample Iframe page']");
	@Before
	public void setUp() throws InterruptedException
	{		
		bs.setUpBrowser();
	}
//	@Test
//	public void zTest() throws InterruptedException {
//		bs.launchURL("http://toolsqa.com/automation-practice-table/");
////		get("http://toolsqa.com/automation-practice-table/");
//		WebElement table = bs.find(tabaleby);
//		List<WebElement> thRow = bs.finds(By.xpath("//tr"));
//		boolean flag = false;
//		for (int i = 0; i < thRow.size(); i++) {
//			// System.out.println(thRow.get(i).getText());
//			List<WebElement> col = thRow.get(i).findElements(By.tagName("td"));
//			for (int j = 0; j < col.size(); j++) {
//				System.out.println(col.get(j).getText());
////				Verify.that(true, flag);
//				Verify.that(true, flag);
//			}
//			
//		}
//	}
//	
	@Test
	public void aTest() throws InterruptedException
	{
//		bs.getDriver().get("http://toolsqa.com/iframe-practice-page/");
		bs.launchURL("http://toolsqa.com/iframe-practice-page/");
		Thread.sleep(10000);
		bs.getDriver().switchTo().frame("iframe2");
		WebElement practieAutomation =  bs.getDriver().findElement(By.xpath("//h1[text()='Home']"));
		System.out.println(practieAutomation.getText());
		bs.getDriver().findElement(By.xpath("//a[text()='Tab 2 ']")).click();
		System.out.println("Clicked on tab 2");
		Thread.sleep(10000);
		System.out.println("Value after clicking on tab 2 is ---->> \n"+bs.getDriver().findElement(By.xpath("//b[text()='Content 2 Title']/following-sibling::p[text()='The content could contain anything text page or submit form or any other HTML objects.']")).getText());
		bs.getDriver().switchTo().defaultContent();
		System.out.println(bs.getDriver().findElement(By.xpath("//h1[text()='Sample Iframe page']")).getText());
		String str=bs.getDriver().findElement(By.xpath("//h1[text()='Sample Iframe page']")).getText();
//		assertEquals(str, "Sample Iframe ","Actual comparison of actual and expected");
		Verify.that(bs.getText(sampleby), "Sample Iframe page");
	}
	
	@After
	public void closeDown()
	{
//		bs.getDriver().quit();
		bs.quit();
	}

}
