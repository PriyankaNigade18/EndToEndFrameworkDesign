package com.swaglab.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglab.base.TestBase;

public class InventoryPage extends TestBase
{
	@FindBy(xpath="//div//div[@class='inventory_item_name ']")
	List<WebElement> allProducts;
	
	@FindBy(id="add-to-cart")
	WebElement addCartBtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartOption;
	
	public InventoryPage()
	{
		PageFactory.initElements(driver,this);
	}
	//action Method
	
	public int validateTotleProduct()
	{
		return allProducts.size();
	}

	public void verifyProductName()
	{
		for(WebElement i:allProducts)
		{
			System.out.println(i.getText());
		}
	}
	
	public AddToCartPage addProductToCart(String pname)
	{
		for(WebElement i:allProducts)
		{
			if(i.getText().contains(pname))
			{
				System.out.println("Product selected: "+pname);
				i.click();
				break;
			}
		}
		addCartBtn.click();
		cartOption.click();
		//this method return me cart page handle
		return new AddToCartPage();

	}
}


