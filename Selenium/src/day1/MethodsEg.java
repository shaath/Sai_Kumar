package day1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		//getTitle()
//		System.out.println(driver.getTitle());
		//getCurrentUrl()
		
//		System.out.println(driver.getCurrentUrl());
		//getPageSource()
//		System.out.println(driver.getPageSource());
		
		//manage()
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		//navigate()
		driver.navigate().to("http://facebook.com");
		Sleeper.sleepTightInSeconds(5);
		//
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().refresh();
		
	}

}
