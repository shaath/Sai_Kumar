package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RobotEg1 {

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/download/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("3.0.1")).click();
		Sleeper.sleepTightInSeconds(5);
		
		Robot Anushka=new Robot();
		
		Anushka.keyPress(KeyEvent.VK_TAB);
		Anushka.keyRelease(KeyEvent.VK_TAB);
		
		Anushka.keyPress(KeyEvent.VK_TAB);
		Anushka.keyRelease(KeyEvent.VK_TAB);
		
		Anushka.keyPress(KeyEvent.VK_ENTER);
		Anushka.keyRelease(KeyEvent.VK_ENTER);

	}

}
