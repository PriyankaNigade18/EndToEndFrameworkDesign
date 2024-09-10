package com.swaglab.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglab.base.TestBase;
import com.swaglab.pages.AddToCartPage;
import com.swaglab.pages.CheckOutPage;
import com.swaglab.pages.InventoryPage;
import com.swaglab.pages.LoginPage;
import com.swaglab.pages.OverViewPage;

public class OverViewPageTest extends TestBase
{
	LoginPage lp;
	InventoryPage ip;
	AddToCartPage ap;
	CheckOutPage cp;
	OverViewPage op;
	
	public OverViewPageTest()
	{
		super();
    }
	
	@BeforeMethod
	public void setUp()
	{
		initialize();
		lp=new LoginPage();
		ip=lp.validateLogin(prop.getData("username"),prop.getData("password"));
		ap=ip.addProductToCart(prop.getData("pname1"));
		cp=ap.doCheckOut();
		op=cp.doCheckout();
	}
	
  @Test(priority=1)
  public void verifySummary() 
  {
	  op.getProductSummary();
  }
  
  @Test(priority=2)
  public void validationFinish() 
  {
	  op.doFinish();
  }
}
