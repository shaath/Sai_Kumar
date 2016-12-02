package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg4 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		//Method 1
//		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();
		
		//Method 2
		
//		List<WebElement> links=driver.findElements(By.linkText("Home"));
//		
//		System.out.println(links.size());
//		
//		for (int i = 0; i < links.size(); i++) 
//		{
//			String href=links.get(i).getAttribute("href");
//			System.out.println(href);
//			if (href.equalsIgnoreCase("http://primusbank.qedgetech.com/home.aspx"))
//			{
//				links.get(i).click();
//				break;
//			}
//		}
		
		//Method 3
		
		
		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td")).findElement(By.linkText("Home")).click();
		

	}

}
