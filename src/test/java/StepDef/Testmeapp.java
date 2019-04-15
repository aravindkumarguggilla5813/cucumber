package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testmeapp {
	WebDriver driver=null;
	@Given("^the login page is opened$")
	public void the_login_page_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8090/TestMeApp2.2/login.htm");
		
	}

	@When("^user enters \"(.*)\" and  user enters \"(.*)\"$")
	public void user_enters_and_user_enters(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	 
	}

	@Then("^user will   Finds a testmeapp homepage$")
	public void user_will_Finds_a_testmeapp_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
		  driver.close();

	}
	
	
}
