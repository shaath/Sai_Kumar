package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLAunch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:/Cdownloads/chromedriver.exe");
		ChromeDriver Anushka=new ChromeDriver();
		
		Anushka.get("http://facebook.com");
		
		Anushka.close();

	}

}
