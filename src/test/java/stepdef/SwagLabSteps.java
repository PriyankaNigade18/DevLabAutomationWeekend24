package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabSteps
{
	WebDriver driver;
	@Given("Open SwagLab application using url {string}")
	public void open_swag_lab_application_using_url(String url) {
	    driver=new ChromeDriver();
	    driver.get(url);
	    
	}

	@When("User enter valid username {string} and enter valid password {string}")
	public void user_enter_valid_username_and_enter_valid_password(String un, String psw) {
	    driver.findElement(By.id("user-name")).sendKeys(un);
	    driver.findElement(By.id("password")).sendKeys(psw);
	    
	}

	@When("User click on SwagLabs login button")
	public void user_click_on_swag_labs_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("User should navigate to Inventory page for sucessfull login")
	public void user_should_navigate_to_inventory_page_for_sucessfull_login() {
	   String exp="inventory";
	   Assert.assertTrue(driver.getCurrentUrl().contains(exp),"Login Fail");
	   System.out.println("Login completed!...User navigated to Inventory page");
	}




}
