package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FFLaunch {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		//get(url)
		driver.get("http://gmail.com");

		driver.close();
	}

}
