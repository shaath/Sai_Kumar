package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Radiobuttonseg2 {

	public static void main(String[] args)
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
//		List<WebElement> radios=block.findElements(By.tagName("input"));
//		System.out.println(radios.size());
//		
//		for (int i = 0; i < radios.size(); i++) 
//		{
//			String radioText=radios.get(i).getAttribute("value");
//			System.out.println(radioText);
//			if (radioText.equalsIgnoreCase("milk"))
//			{
//				radios.get(i).click();
//			}
//			else if (radioText.equalsIgnoreCase("beer"))
//			{
//				radios.get(i).click();
//			}
//			
//		}
		
		List<WebElement> group1=block.findElements(By.name("group1"));
		for (int i = 0; i < group1.size(); i++) 
		{
			String rText=group1.get(i).getAttribute("value");
			if (rText.equalsIgnoreCase("cheese"))
			{
				group1.get(i).click();
				break;
			}
		}
		
		List<WebElement> group2=block.findElements(By.name("group2"));
		for (int i = 0; i < group2.size(); i++) 
		{
			String rText1=group2.get(i).getAttribute("value");
			if (rText1.equalsIgnoreCase("water"))
			{
				group2.get(i).click();
				break;
			}
		}

	}

}
