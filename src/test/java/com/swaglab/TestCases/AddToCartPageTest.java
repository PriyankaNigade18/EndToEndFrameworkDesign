package com.swaglab.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglab.base.TestBase;
import com.swaglab.pages.AddToCartPage;
import com.swaglab.pages.CheckOutPage;
import com.swaglab.pages.InventoryPage;
import com.swaglab.pages.LoginPage;

public class AddToCartPageTest extends TestBase
{
	LoginPage lp;
	InventoryPage ip;
	AddToCartPage ac;
	CheckOutPage cp;
	
	
	public AddToCartPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialize();
		lp=new LoginPage();
		ip=lp.validateLogin(prop.getData("username"),prop.getData("password"));
		ac=ip.addProductToCart(prop.getData("pname1"));
	}
  @Test(priority=1)
  public void verifyDescription() 
  {
	  ac.validateDescription();
  }
  
  @Test(priority=2)
  public void validateRemoveProduct() 
  {
	  ac.doRemove();
  }
  
  @Test(priority=3)
  public void validateContinueshopping()
  {
	  ip=ac.doContinue();
	  ac=ip.addProductToCart(prop.getData("pname2"));
  }
  
  @Test(priority=4)
  public void ClickCheckout()
  {
	  cp=ac.doCheckOut();
  }
  
}
