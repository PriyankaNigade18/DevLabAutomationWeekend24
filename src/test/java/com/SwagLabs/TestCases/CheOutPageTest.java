package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.BaseClass.BaseTest;

public class CheOutPageTest extends BaseTest
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		addWait();
		ip.addProductToCart(prop.getData("pname1"));
	addWait();
	cp=ip.getCartPage();
	addWait();
	cp.doCheckout();
		
	}
	
	
	
  @Test
  public void validateCheckOut()
  {
	  ch.doContinue(prop.getData("fn"),prop.getData("ln"),prop.getData("zc"));
  }
}
