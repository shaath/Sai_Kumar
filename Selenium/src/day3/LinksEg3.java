package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args)
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		//findElements()
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links available in google page :"+links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String lText=links.get(i).getText();
			if (lText.equalsIgnoreCase("Rajinikanth")) 
			{
				flag=true;
				break;
			}
		}
		if (flag==true)
		{
			System.out.println("The expected link available");
		}
		else
		{
			System.out.println("The expected link not avialble");
		}
	}

}
