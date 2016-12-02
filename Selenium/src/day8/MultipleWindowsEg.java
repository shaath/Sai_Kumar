package day8;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowsEg 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		String gmailid=driver.getWindowHandle();
//		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String Wid=it.next();
			System.out.println(Wid);
			
			driver.switchTo().window(Wid);
			
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(3);
				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
				break;
			}
			catch (Exception e)
			{
				System.out.println("The expected link not avialbe in this page");
			}
			
		}
		
		
		driver.switchTo().window(gmailid);
		System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
		
		driver.quit();
		
		

	}

}
