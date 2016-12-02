package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import day10.webdriwaiteg;

public class PrimusLoginTC 
{
	public static WebDriver driver;
	@BeforeTest
	public void Browser_Launch()
	{
		driver=new FirefoxDriver();
	}

	@BeforeMethod
	public void App_Launch()
	{
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void App_Login()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterMethod
	public void App_Logout()
	{
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	
	@AfterTest
	public void Browser_Close()
	{
		driver.close();
	}
}
