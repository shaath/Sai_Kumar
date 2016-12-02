package pom;


import org.openqa.selenium.server.browserlaunchers.Sleeper;

import org.testng.annotations.Test;



public class LoginTC extends Contants
{
	@Test
	public void org_Login()
	{
	
		driver.get(lp.url);
		driver.manage().window().maximize();
		
		lp.login(lp.u, lp.p);
		
		Sleeper.sleepTightInSeconds(5);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
