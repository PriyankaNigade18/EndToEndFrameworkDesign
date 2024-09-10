package com.swaglab.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglab.base.TestBase;
import com.swaglab.pages.InventoryPage;
import com.swaglab.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage lp;
	InventoryPage ip;
	
	/*
	 * 1.create a constructor of super class
	 * so that we can load the properties first
	 * 
	 */
	
	public LoginPageTest()
	{
	super();	
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		//for browser setup
		initialize();
		//create a object of loginpage
		lp=new LoginPage();
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
  @Test(priority=1)
  public void validateLoginPageUrl()
  {
	  String actUrl=lp.validateLoginPageUrl();
	  Assert.assertTrue(actUrl.contains("demo"),"Url not matched!");
	  System.out.println("Url is matched!");
  }
  
  @Test(priority=2)
  public void validateLoginPageTitle()
  {
	  String actTitle=lp.validateLoginpageTitle();
	  Assert.assertTrue(actTitle.contains("Labs"),"Title not matched!");
	  System.out.println("Title is matched!");
  }
  @Test(priority=3)
  public void validateLogin()
  {
	  ip=lp.validateLogin(prop.getData("username"),prop.getData("password"));
  }
  
}
