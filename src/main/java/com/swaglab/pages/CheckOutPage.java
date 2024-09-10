package com.swaglab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglab.base.TestBase;

public class CheckOutPage extends TestBase{

	
	public CheckOutPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement zcode;
	
	@FindBy(id="continue")
	WebElement btn;
	
	//action methods
	public OverViewPage doCheckout()
	{
		fname.sendKeys(prop.getData("fn"));
		lname.sendKeys(prop.getData("ln"));
		zcode.sendKeys(prop.getData("zcode"));
		btn.click();
		return new OverViewPage();
		
	}
	
	
	
}
