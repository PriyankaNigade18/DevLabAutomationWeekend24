package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DefaultTimeOut {
  @Test
  public void testDefaultTimeOut() 
  {
	  WebDriver driver=new ChromeDriver();
	  //set pageload timeout
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
	  //set Implicit wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //set scripttimeout
	  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
	  
	  driver.get("https://www.google.com");
	  
	  driver.findElement(By.name("q")).sendKeys("testNg");
	  
	  /*
	   * Capabilities {acceptInsecureCerts: false, 
	   * browserName: chrome, 
	   * browserVersion: 129.0.6668.90, 
	   * chrome: {chromedriverVersion: 129.0.6668.89
	   *  (951c0b97221f..., 
	   *  userDataDir: C:\Users\Ganes\AppData\Loca...}, 
	   *  fedcm:accounts: true, 
	   *  goog:chromeOptions: 
	   *  {debuggerAddress: localhost:60644},
	   *   networkConnectionEnabled: false,
	   *    pageLoadStrategy: normal, 
	   *    platformName: windows, proxy: Proxy(),
	   *     se:cdp: ws://localhost:60644/devtoo..., 
	   *     se:cdpVersion: 129.0.6668.90, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true,
	   *  webauthn:virtualAuthenticators: true}
	   */
  }
}
