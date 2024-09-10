package com.swaglab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglab.base.TestBase;
import com.swaglab.pages.AddToCartPage;
import com.swaglab.pages.InventoryPage;
import com.swaglab.pages.LoginPage;

public class InventoryPageTest extends TestBase 
{
	LoginPage lp;
	InventoryPage ip;
	AddToCartPage ac;
	
	public InventoryPageTest()
	{
		super();
	}


	@BeforeMethod
	public void  setUp()
	{
		initialize();
		lp=new LoginPage();
		ip=lp.validateLogin(prop.getData("username"),prop.getData("password"));
		
	}
	
  @Test(priority=1)
  public void validateTotalOpyions()
  {
	  int total=ip.validateTotleProduct();
	  Assert.assertEquals(total,6,"Product count not match");
	  System.out.println("Product count matched!");
	  
  }
  
  
 @Test(priority=2)
 public void ValidateProducts()
 {
	 ip.verifyProductName();
 }
 
 @Test(priority=3)
 public void addProductToCart()
 {
	 ac=ip.addProductToCart(prop.getData("pname1"));
 }
}
