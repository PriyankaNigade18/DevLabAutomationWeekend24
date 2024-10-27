package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BrowserProvider;

public class CRMSteps //extends BaseClass{
{
	WebDriver driver=BrowserProvider.getDriver();
//	@Before
//	public void setup()
//	{
//		 driver=new ChromeDriver();
//	}
//	
//	@After
//	public void tearDown()
//	{
//		driver.quit();
//	}
	@Given("Open CRM application")
	public void open_crm_application() {
		 //driver=new ChromeDriver();
	   driver.get("https://automationplayground.com/crm/");
	}

	@When("User click on SignIn")
	public void user_click_on_sign_in() {
	    driver.findElement(By.linkText("Sign In")).click();
	    
	}

	@Then("User should navigated to login page")
	public void user_should_navigated_to_login_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	    System.out.println("User navigated to login page");
	    
	}

	@When("user enter {string} email and {string} password")
	public void user_enter_email_and_password(String email, String psw) {
	 driver.findElement(By.name("email-name")).sendKeys(email);
	 driver.findElement(By.id("password")).sendKeys(psw);
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("USer should navigate to Customers page")
	public void u_ser_should_navigate_to_customers_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("customers"));
	    System.out.println("Login completed!");
	}

}
