package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Contants
{
	public static WebDriver driver=new FirefoxDriver();
	
	public static LoginPAge lp=PageFactory.initElements(driver, LoginPAge.class);
	
	public static AdminPage ap=PageFactory.initElements(driver, AdminPage.class);

}
