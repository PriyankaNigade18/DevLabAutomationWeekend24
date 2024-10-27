package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCartSteps 
{
	WebDriver driver;
	@Given("Open Register page")
	public void open_register_page()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

	}

	@When("User enters all details")
	public void user_enters_all_details(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		List<Map<String,String>> data=table.asMaps();
		driver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get("fname"));
		driver.findElement(By.name("lastname")).sendKeys(data.get(0).get("lname"));
		driver.findElement(By.name("email")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.name("telephone")).sendKeys(data.get(0).get("telephone"));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
		driver.findElement(By.name("confirm")).sendKeys(data.get(0).get("cpassword"));
		
		
		
		
	}

	@When("User click yes radio button")
	public void user_click_yes_radio_button() {
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
	}

	@When("User check the privacy policy checkbox")
	public void user_check_the_privacy_policy_checkbox() {

		driver.findElement(By.name("agree")).click();
		
	}

	@When("User click on contineue button")
	public void user_click_on_contineue_button() {

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		

	}

	@Then("User should be register into app")
	public void user_should_be_register_into_app() {
		Assert.assertTrue(driver.getCurrentUrl().contains("account"));
		System.out.println("User Register successfully!");
		String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
		System.out.println("Successfull message: "+text);
	}

	@Given("Open opencart login page")
	public void open_opencart_login_page() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("user enter {string} and password {string}")
	public void user_enter_and_password(String email, String pass) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pass);
	}

	@When("User click on cart login button")
	public void user_click_on_cart_login_button() {
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should be navigated to account page")
	public void user_should_be_navigated_to_account_page() {
	    
		Assert.assertTrue(driver.getCurrentUrl().contains("account"));
		System.out.println("Login completed!");
	}





}
