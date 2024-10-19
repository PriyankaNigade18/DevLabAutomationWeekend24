package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.BaseClass.BaseTest;

public class InventoryPageTest extends BaseTest
{
	
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
	}
  @Test(priority=1)
  public void validateProductCount()
  {
	  int count=ip.getProductCount();
	  Assert.assertEquals(count,6);
	  System.out.println("Total Products matched!: "+count);
  }
  
  @Test(priority=2)
  public void validateProductDetails()
  {
	  ip.getProductDetails();
  }
  
  @Test(priority=3)
  public void validateAddToCartFeature()
  {
	  ip.addProductToCart(prop.getData("pname1"));
  }
  
  
  @Test(priority=4)
  public void openCartPage()
  {
	  ip.getCartPage();
  }
  
  
}
