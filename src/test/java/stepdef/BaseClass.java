package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	WebDriver driver;
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
