package com.swaglab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglab.base.TestBase;

public class AddToCartPage  extends TestBase
{
	
	public AddToCartPage ()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='cart_item']")
	WebElement description;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeBtn;
	
	@FindBy(id="continue-shopping")
	WebElement continueBtn;
	
	@FindBy(id="checkout")
	WebElement checkoutBtn;
	
	
	//action methods
	public void validateDescription()
	{
		System.out.println(description.getText());
	}
	
	public void doRemove()
	{
		removeBtn.click();
		System.out.println("Product Removed from cart");
		
	}

	public InventoryPage doContinue()
	{
		continueBtn.click();
		return new InventoryPage();
	}
	
	public CheckOutPage doCheckOut()
	{
		checkoutBtn.click();
		return new CheckOutPage();
	}
}
