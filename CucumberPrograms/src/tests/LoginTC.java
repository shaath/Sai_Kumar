package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTC extends JunitMaster
{

	@Test
	public void login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
}
