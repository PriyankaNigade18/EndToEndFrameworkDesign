package com.swaglab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglab.base.TestBase;

public class OverViewPage extends TestBase
{

	public OverViewPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="checkout_summary_container")
	WebElement info;
	
	@FindBy(id="finish")
	WebElement fbtn;
	
	@FindBy(tagName="h2")
	WebElement text;
	
	
	//action methods
	
	public void getProductSummary()
	{
		System.out.println("************Product summary********");
		System.out.println(info.getText());
	}
	
	public void doFinish()
	{
		fbtn.click();
		System.out.println("Final status: "+text.getText());
	}
}
