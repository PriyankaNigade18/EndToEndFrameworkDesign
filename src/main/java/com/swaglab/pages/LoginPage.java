package com.swaglab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglab.base.TestBase;

public class LoginPage extends TestBase{

	//WebDriver driver;
	
	//to initialize all theses elements we need PageFactory
		public LoginPage()
		{ 
			//this.driver=driver;
			PageFactory.initElements(driver,this);
		}

	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	
	
	//action methods
	public String validateLoginpageTitle()
	{
		return driver.getTitle();
	}
	
	public String validateLoginPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public InventoryPage validateLogin(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		//after login next landing page is inventory so login function return us inventory page class object
		return new InventoryPage();
	}
	
	
}
