package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogoutTest 
{
	public static WebDriver driver;
	@Given("^the browser launch and navigate to the url$")
	public void the_browser_launch_and_navigate_to_the_url() throws Throwable
	{
	   driver=new FirefoxDriver();
	   driver.get("http://opensource.demo.orangehrmlive.com");
	}

	@When("^tester enters username and password$")
	public void tester_enters_username_and_password() throws Throwable 
	{
	     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	     driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^clicks on login$")
	public void clicks_on_login() throws Throwable 
	{
	     driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^should display welcome admin message$")
	public void should_display_welcome_admin_message() throws Throwable
	{
	    String expval="Welcome Admin";
	    String actval=driver.findElement(By.id("welcome")).getText();
	    Assert.assertEquals(actval,expval);
	    Thread.sleep(5000);
	}

	@When("^Tester clicks on welcome admin link$")
	public void tester_clicks_on_welcome_admin_link() throws Throwable
	{
		driver.findElement(By.id("welcome")).click();
	}

	@When("^also click on Logout	link$")
	public void also_click_on_Logout_link() throws Throwable 
	{
	   driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^should logout and display login page$")
	public void should_logout_and_display_login_page() throws Throwable 
	{
	     String exptitle="OrangeHRM";
	     String acttitle=driver.getTitle();
	     Assert.assertEquals(acttitle, exptitle);
	}

}
