package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class HrmSteps 
{
	WebDriver driver;
	@Given("Opne Hrm application")
	public void opne_hrm_application() {
		driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

	@When("I enter {string} and enter {string}")
	public void i_enter_and_enter(String un, String psw) {

		driver.findElement(By.name("username")).sendKeys(un);
		  driver.findElement(By.name("password")).sendKeys(psw);
		  
	}

	@When("I click on Hrm login button")
	public void i_click_on_hrm_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  
		  
	}

	@Then("I should able to navigate to Dashboard page for successful login")
	public void i_should_able_to_navigate_to_dashboard_page_for_successful_login() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		  System.out.println("Login done!");
	}




}
