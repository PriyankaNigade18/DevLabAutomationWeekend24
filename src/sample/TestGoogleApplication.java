package sample;

import org.openqa.selenium.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TestGoogleApplication {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actTitle=driver.getTitle();
		System.out.println("Title: "+actTitle);
		String url=driver.getCurrentUrl();
		System.out.println("URL: "+url);
		driver.findElement();
		driver.findElements();

		
	}

}
