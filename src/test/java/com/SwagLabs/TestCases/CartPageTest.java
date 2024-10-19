package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.BaseClass.BaseTest;

public class CartPageTest extends BaseTest
{
	@BeforeClass
	public void pageSetUP()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		addWait();
		ip.addProductToCart(prop.getData("pname1"));
		addWait();
		cp=ip.getCartPage();
		addWait();
	}
	
	
  @Test(priority=1)
  public void validateDetails()
  {
	  cp.getDetails();
  }
  
  @Test(priority=2)
  public void validateRemoveProduct()
  {
	  cp.doRemove();
  }
  
  @Test(priority=3)
  public void validateContinueShopping()
  {
	  ip=cp.doContinueShopping();
	  addWait();
	  ip.addProductToCart(prop.getData("pname2"));
	  addWait();
	  cp=ip.getCartPage();
	  addWait();
	  cp.getDetails();
  }
  
  @Test(priority=4)
  public void validateCheckout()
  {
	  cp.doCheckout();
  }
}
