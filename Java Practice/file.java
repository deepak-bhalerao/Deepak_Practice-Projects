package auto;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file
{
	WebDriver w;

	public  file()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

	}
	public void ab() throws InterruptedException//due to applying thread
	{
		w.get("https://www.google.co.in/?gfe_rd=cr&ei=rDK9V6GsMpPT8gf1hbDoCg&gws_rd=ssl");//open of google page
		w.findElement(By.xpath(".//*[@class='gb_b gb_Rb']")).click();//click on icon
		Thread.sleep(3000);//hold for 30sec
		java.util.List<WebElement>list=w.findElements(By.xpath(".//*[@class='gb_Z']"));//store list of webelements
		for (int i = 0; i < list.size(); i++) {//counting list of items
			System.out.println(list.get(i).getText());
			
		}
		list.get(7).click();//index of item i.e.google drive starting from 0 
		w.findElement(By.xpath("//*[@id='start']/section[4]/div/div/a")).click();//starting google drive
		w.findElement(By.xpath(".//*[@id='Email']")).sendKeys("blendinfo23");//
		w.findElement(By.xpath(".//*[@id='next']")).click();
		w.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("atanu@123");
		w.findElement(By.xpath(".//*[@id='signIn']")).click();
		w.findElement(By.xpath(".//*[@id='drive_main_page']/div[4]/div/div[1]/div/div/div[1]/div[1]/div/div/div[1]")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath(".//*[@id='lcssenderclient']")).click();
}
	public static void main(String[] args)throws InterruptedException {
		file f=new file();
		f.ab();
		
		
	}
	}

