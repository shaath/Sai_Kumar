package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class WebTableEg {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		System.out.println("The number of rows available in Table "+rows.size());
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("The columns count in "+i+" row are: "+cols.size());
			
			String eId=cols.get(1).getText();
			if (eId.equals("0008"))
			{
				cols.get(0).click();
				Sleeper.sleepTightInSeconds(3);
				driver.findElement(By.id("btnDelete")).click();
				Sleeper.sleepTightInSeconds(3);
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}
		
		
	}

}
