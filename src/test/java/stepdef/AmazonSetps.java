package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSetps {

	WebDriver driver;
	String actTitle;
	@Given("Open Amazon application")
	public void open_amazon_application()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
	    
	}

	@When("User get the home page title")
	public void user_get_the_home_page_title() {
	    
		actTitle=driver.getTitle();
		System.out.println("Home page title is: "+actTitle);
	}

	@Then("title should match with homepage")
	public void title_should_match_with_homepage() {
	   Assert.assertTrue(actTitle.contains("India"));
	   System.out.println("Home page title macthed!");
	}

	@When("User open Sell page")
	public void user_open_sell_page() 
	{
	   driver.findElement(By.linkText("Sell")).click();
	}

	@When("User get the sell page title")
	public void user_get_the_sell_page_title() {
	    actTitle=driver.getTitle();
	    System.out.println("Sell page title: "+actTitle);
	}

	@Then("Title should match with sellpage")
	public void title_should_match_with_sellpage() {
	   Assert.assertTrue(actTitle.contains("All Categories"));
	   System.out.println("Sell page Title matched!");
	}

	@When("User open Mobile page")
	public void user_open_mobile_page() {
	    driver.findElement(By.linkText("Mobiles")).click();
	    
	}

	@When("User get the Mobile page title")
	public void user_get_the_mobile_page_title() {

		actTitle=driver.getTitle();
		System.out.println("Mobile page title: "+actTitle);
	}

	@Then("Title should match with mobile page")
	public void title_should_match_with_mobile_page() {

		Assert.assertTrue(actTitle.contains("Phones"));
		System.out.println("Mobile page title matched!");
	}


}
