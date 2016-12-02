package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MouseHoverops {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.xpath(".//*[@id='nav-link-shopall']"));
		
		Actions anushka=new Actions(driver);
		//Focus on the catagory
		anushka.moveToElement(cat).build().perform();
		Sleeper.sleepTightInSeconds(5);
		WebElement mobiles=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[5]/span"));
		//Focus on the mobiles and tablets
		anushka.moveToElement(mobiles).build().perform();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[5]/div[1]/div/a[7]/span")).click();
	}

}
