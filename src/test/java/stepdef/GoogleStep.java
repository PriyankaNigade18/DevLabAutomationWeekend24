package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleStep 
{
	WebDriver driver;
	
	String title;
	@Given("launch Google application")
	public void launch_google_application()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	    
	}

	@When("user get the current page title")
	public void user_get_the_current_page_title()
	{
	    title=driver.getTitle();
	    System.out.println("Application current page title is: "+title);
	}

	@Then("Application title should match with Google")
	public void application_title_should_match_with_google()
	{
	  Assert.assertEquals(title,"Google","Title not matched...Test Fail!");
	    System.out.println("Title matched.....Test Pass!");
		
	}

	@When("User search for {string} into serach box")
	public void user_search_for_into_serach_box(String keyword) 
	{
	    driver.findElement(By.id("APjFqb")).sendKeys(keyword);
	    
	}

	@Then("User should get appropriate search result")
	public void user_should_get_appropriate_search_result() {
	    List<WebElement> list1=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));

	    System.out.println("Total options are: "+list1.size());
	    
	    for(WebElement i:list1)
	    {
	    	System.out.println(i.getText());
	    }
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
