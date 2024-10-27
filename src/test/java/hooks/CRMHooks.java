package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BrowserProvider;

public class CRMHooks {

	
	public WebDriver driver;
	
	@Before
	public void setup()
	{
		 //driver=new ChromeDriver();
		driver=BrowserProvider.setDriver("chrome");
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}


}
